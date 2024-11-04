/**
 * Implements the Bubble Sort algorithm, a simple sorting technique that
 * repeatedly
 * steps through the list, compares adjacent elements, and swaps them if they
 * are in the wrong order.
 * This process repeats until the list is sorted.
 * 
 * Implements the `SortingStrategy` interface, allowing it to be used
 * interchangeably with other sorting strategies.
 */
public class BubbleSort implements SortingStrategy {

    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     * 
     * @param a The array of integers to be sorted in ascending order.
     */
    @Override
    public void sort(int[] a) {
        int i, j, aux;

        // Outer loop goes through each element, excluding the last sorted ones in each
        // pass
        for (i = 0; i < a.length - 1; i++) {
            // Inner loop compares adjacent elements and swaps them if out of order
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    // Swap a[j+1] and a[j] if they are in the wrong order
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
        }
    }
}
