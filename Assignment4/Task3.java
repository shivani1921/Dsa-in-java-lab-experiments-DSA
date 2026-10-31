package Assignment4;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = { 64, 25, 12, 22, 11 };

        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int temp = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}