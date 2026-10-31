package Assignment12;

public class Task2 {

    static int sum(int n) {

        if (n == 0) {
            return 0; // Base case
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Sum of 10: " + sum(10));
    }
}