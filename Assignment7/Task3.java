package Assignment7;

public class Task3 {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4 };

        int product = 1;

        for (int i = 0; i < arr.length; i++) {

            product = product * arr[i];
        }

        System.out.println("Product: " + product);
    }
}
