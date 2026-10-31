package Assignment6;

public class Task2 {

    static int binarySearch(int[] a, int key) {

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        int result = binarySearch(arr, 35);

        System.out.println("Index: " + result);
    }
}