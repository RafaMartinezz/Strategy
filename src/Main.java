/**
 * Demonstrates the use of different sorting strategies on sample data arrays.
 * The `Main` class initializes various sorting strategies, applies each
 * strategy to an array of integers,
 * and prints the sorted results for comparison.
 */
class Main {

    /**
     * Prints the elements of an integer array in a single line.
     *
     * @param a The array of integers to be printed.
     */
    static void imprimir(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Main method demonstrating the Strategy pattern with sorting algorithms.
     * Three different sorting strategies (Insertion Sort, Bubble Sort, and
     * Selection Sort)
     * are applied to three distinct arrays. The sorted results are printed to the
     * console.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Array of sorting strategies implementing the SortingStrategy interface
        SortingStrategy[] misEstrategias = {
                new InsertionSort(), new BubbleSort(), new SelectionSort()
        };

        // Parallel array containing different sets of unsorted data to be sorted
        int[][] data = {
                { 9, 6, 7, 1, 4, 3, 2, 5, 8 },
                { 9, 1, 6, 7, 8, 4, 3, 2, 5 },
                { 9, 8, 7, 6, 5, 4, 3, 2, 1 }
        };

        // SortContext object to apply sorting strategies
        SortContext sortContext = new SortContext();

        // Loop through each sorting strategy and corresponding data set
        for (int i = 0; i < misEstrategias.length; i++) {
            sortContext.setData(data[i]); // Set the data to be sorted
            sortContext.setStrategy(misEstrategias[i]); // Set the sorting strategy
            sortContext.sort(); // Perform the sorting operation
            System.out.println("\nCon método sort de " + misEstrategias[i].getClass().getName());
            imprimir(data[i]); // Print the sorted array
        }
    }
}
