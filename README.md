# Sorting Strategy Pattern in Java

This Java project demonstrates the **Strategy design pattern** by implementing various sorting algorithms. The program uses a `SortContext` class that can apply different sorting strategies (such as Bubble Sort, Insertion Sort, and Selection Sort) to an array of integers. This approach allows the sorting algorithm to be dynamically selected at runtime, providing flexibility and extensibility in algorithm selection.

## Table of Contents

- [Overview](#overview)
- [Purpose](#purpose)
- [Features](#features)
- [Class Structure](#class-structure)
- [Example Usage](#example-usage)
- [Explanation](#explanation)

---

## Overview

The project leverages the **Strategy pattern** to allow different sorting algorithms to be applied to an array without modifying the array-handling logic. The `SortContext` class holds a reference to a `SortingStrategy`, which is an interface implemented by multiple sorting algorithms. This structure allows the `SortContext` to swap out sorting algorithms based on the needs of the application, providing a flexible and modular solution for sorting.

## Purpose

This project serves as a **learning exercise** in:
- Implementing the **Strategy design pattern** to separate sorting logic from application logic.
- Applying **polymorphism** to allow interchangeable use of sorting algorithms.
- Demonstrating **clean and extensible design**, where new sorting algorithms can be added with minimal changes to existing code.

## Features

- **Multiple Sorting Algorithms**: Implements Bubble Sort, Insertion Sort, and Selection Sort as interchangeable strategies.
- **Dynamic Strategy Selection**: Enables runtime selection of the sorting algorithm, allowing for flexible testing and performance evaluation.
- **Modularity and Extensibility**: New sorting algorithms can be easily added by implementing the `SortingStrategy` interface.

## Class Structure

- **`SortingStrategy`**: An interface that defines the `sort` method, which sorts an integer array.
- **`SortContext`**: Holds a reference to a `SortingStrategy` and an array to be sorted. This class can set different sorting strategies dynamically and execute the selected sorting algorithm.
- **`BubbleSort`**: Implements the Bubble Sort algorithm.
- **`InsertionSort`**: Implements the Insertion Sort algorithm.
- **`SelectionSort`**: Implements the Selection Sort algorithm.
- **`Main`**: Demonstrates the use of each sorting strategy on sample data arrays, applying and printing the results of each sorting method.

## Example Usage

Below is an example interaction where each sorting algorithm is applied to sample arrays:

```java
SortingStrategy[] misEstrategias = {
    new InsertionSort(), new BubbleSort(), new SelectionSort()
};
int[][] data = {
    {9, 6, 7, 1, 4, 3, 2, 5, 8},
    {9, 1, 6, 7, 8, 4, 3, 2, 5},
    {9, 8, 7, 6, 5, 4, 3, 2, 1}
};
SortContext sortContext = new SortContext();

for (int i = 0; i < misEstrategias.length; i++) {
    sortContext.setData(data[i]);
    sortContext.setStrategy(misEstrategias[i]);
    sortContext.sort();
    System.out.println("\nSorted with " + misEstrategias[i].getClass().getSimpleName() + ":");
    Main.imprimir(data[i]);
}
```

### Example Output

```plaintext
Sorted with InsertionSort:
1 2 3 4 5 6 7 8 9 

Sorted with BubbleSort:
1 2 3 4 5 6 7 8 9 

Sorted with SelectionSort:
1 2 3 4 5 6 7 8 9 
```

## Explanation

The project’s structure is designed to be highly modular and extensible:
1. **Sorting Algorithms**: Each sorting algorithm is encapsulated in its own class and implements the `SortingStrategy` interface, making them easily interchangeable.
2. **Strategy Pattern**: By using the `SortContext` class to handle the sorting operations, the program can easily switch between sorting strategies without modifying the main application logic.
3. **Extensibility**: New sorting algorithms can be added by simply creating a new class that implements `SortingStrategy` and defining the `sort` method.
