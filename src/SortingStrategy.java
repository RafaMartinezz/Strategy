/**
 * SortingStrategy is an interface for sorting algorithms, enabling them to be
 * used interchangeably.
 * By implementing this interface, sorting classes provide a `sort` method to
 * sort arrays of integers.
 * This interface is part of the Strategy pattern, allowing the `SortContext` to
 * apply different sorting strategies at runtime.
 */
public interface SortingStrategy {

    /**
     * Sorts an array of integers in ascending order.
     * 
     * @param a The array of integers to be sorted.
     */
    void sort(int[] a);
}
