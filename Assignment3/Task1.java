package Assignment3;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = { 5, 1, 4, 2, 8 };

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}