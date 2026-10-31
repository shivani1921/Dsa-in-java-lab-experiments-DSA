package Assignment4;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = { 64, 25, 12, 22, 11 };

        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println("Index: " + minIndex);
    }
}