/**
 * Implements the Selection Sort algorithm, which repeatedly finds the minimum
 * element
 * from the unsorted portion of the array and moves it to the sorted portion.
 * 
 * Implements the `SortingStrategy` interface, allowing it to be used
 * interchangeably with other sorting strategies.
 */
public class SelectionSort implements SortingStrategy {

    /**
     * Sorts an array of integers in ascending order using the Selection Sort
     * algorithm.
     * 
     * @param a The array of integers to be sorted.
     */
    @Override
    public void sort(int[] a) {
        int i, j, menor, pos, tmp;

        // Iterate over each position in the array, treating it as the start of the
        // unsorted portion
        for (i = 0; i < a.length - 1; i++) {
            menor = a[i]; // Assume the first unsorted element is the smallest
            pos = i;

            // Find the minimum element in the unsorted portion of the array
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < menor) {
                    menor = a[j];
                    pos = j; // Update the position of the smallest element found
                }
            }

            // Swap the smallest found element with the current position, if necessary
            if (pos != i) {
                tmp = a[i];
                a[i] = a[pos];
                a[pos] = tmp;
            }
        }
    }
}
