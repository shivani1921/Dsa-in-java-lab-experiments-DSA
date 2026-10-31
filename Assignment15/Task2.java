package Assignment15;

public class Task2 {

    static void arrange(char[] letters, boolean[] used,
            String current) {

        // Base case
        if (current.length() == letters.length) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < letters.length; i++) {

            if (!used[i]) {

                // Choose letter
                used[i] = true;

                // Recursive call
                arrange(letters, used, current + letters[i]);

                // Backtrack
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {

        char[] letters = { 'a', 'b', 'c' };
        boolean[] used = new boolean[3];

        arrange(letters, used, "");
    }
}
