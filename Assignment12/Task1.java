package Assignment12;

public class Task1 {

    static int factorial(int n) {

        if (n == 0) {
            return 1; // Base case
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Factorial of 5: " + factorial(5));
    }
}