package Assignment13;

public class Task1 {

    static int sum(int[] a, int i) {

        if (i == a.length) {
            return 0; // Base case
        }

        return a[i] + sum(a, i + 1);
    }

    public static void main(String[] args) {

        int[] a = { 3, 6, 9, 12, 15 };

        System.out.println("Sum: " + sum(a, 0));
    }
}