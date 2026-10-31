package Assignment15;

import java.util.*;

public class Task1 {

    static void subsets(int[] arr, int index, ArrayList<Integer> current) {

        // Base case
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // First: Skip the element
        subsets(arr, index + 1, current);

        // Second: Include the element
        current.add(arr[index]);
        subsets(arr, index + 1, current);

        // Backtrack: Remove the element
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };

        subsets(arr, 0, new ArrayList<>());
    }
}