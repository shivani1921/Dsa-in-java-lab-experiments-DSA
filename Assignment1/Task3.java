package Assignment1;

public class Task3 {
    public static void main(String[] args) {

        int[] marks = { 45, 67, 80, 52, 90 };

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        System.out.println("Sum: " + sum);
    }
}