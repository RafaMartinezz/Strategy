/**
 * Context class that uses a specified sorting strategy to sort an array of
 * integers.
 * By implementing the Strategy pattern, this class allows for flexible swapping
 * of different sorting algorithms at runtime.
 */
public class SortContext {
    private SortingStrategy strategy; // The current sorting strategy to be used
    private int[] data; // The data array to be sorted

    /**
     * Sets the sorting strategy to be used by the context.
     * 
     * @param strategy The sorting strategy to apply (e.g., BubbleSort,
     *                 InsertionSort).
     */
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Sets the data array to be sorted.
     * 
     * @param data The array of integers to be sorted.
     */
    public void setData(int[] data) {
        this.data = data;
    }

    /**
     * Sorts the data array using the currently selected sorting strategy.
     */
    public void sort() {
        strategy.sort(data);
    }
}
