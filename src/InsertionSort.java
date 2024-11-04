/**
 * Implements the Insertion Sort algorithm, which builds the sorted array one
 * item at a time.
 * Efficient for small data sets or arrays that are already partially sorted.
 * 
 * Implements the `SortingStrategy` interface, allowing it to be used
 * interchangeably with other sorting strategies.
 */
public class InsertionSort implements SortingStrategy {

    /**
     * Sorts an array of integers in ascending order using the Insertion Sort
     * algorithm.
     * 
     * @param a The array of integers to be sorted.
     */
    @Override
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int current = a[i]; // Element to be inserted into the sorted portion of the array
            int j = i - 1;

            // Shift elements of the sorted portion that are greater than 'current' to the
            // right
            while (j >= 0 && current < a[j]) {
                a[j + 1] = a[j];
                j--;
            }

            // Insert the 'current' element into its correct position
            a[j + 1] = current;
        }
    }
}
