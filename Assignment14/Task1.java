package Assignment14;

public class Task1 {

    static boolean isSorted(int[] a, int i) {

        if (i == a.length - 1) {
            return true; // Base case
        }

        if (a[i] > a[i + 1]) {
            return false;
        }

        return isSorted(a, i + 1);
    }

    public static void main(String[] args) {

        int[] a = { 2, 4, 6, 8, 10 };

        System.out.println("Is Sorted: " + isSorted(a, 0));
    }
}