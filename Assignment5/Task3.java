package Assignment5;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = { 52, 10, 52, 7, 52 };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 52) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}