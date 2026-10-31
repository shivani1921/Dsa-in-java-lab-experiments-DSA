package Assignment7;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = { 45, 52, 80 };

        int key = 52;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}