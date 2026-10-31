package Assignment14;

public class Task3 {

    static int fib(int n) {

        if (n == 0) {
            return 0; // Base case
        }

        if (n == 1) {
            return 1; // Base case
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci: " + fib(7));
    }
}