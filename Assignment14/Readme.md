Assignment 14: Sorted Check, Search and Fibonacci
Aim: Use recursion to check an array, find a value by index, and compute Fibonacci numbers.
Tasks

1.  Write the method boolean isSorted(int[] a, int i) that returns true when the values from index i to the end are in ascending order. Call it on {2, 4, 6, 8, 10} with i = 0 and print the result.


2.  Write the method int findIndex(int[] a, int key, int i) that returns the index of key from index i onwards, or -1 if absent. Call it on {45, 67, 80, 52, 90}, key 80, i = 0, and print it.




3.  Write the method int fib(int n) using recursion, where fib(0) is 0, fib(1) is 1, and otherwise fib(n) is fib(n - 1) plus fib(n - 2). Print fib(7).