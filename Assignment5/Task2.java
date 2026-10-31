package Assignment5;

public class Task2 {

    static int linearSearch(int[] a, int key) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 45, 67, 80, 52, 90 };

        int result = linearSearch(arr, 100);

        System.out.println("Index: " + result);
    }
}