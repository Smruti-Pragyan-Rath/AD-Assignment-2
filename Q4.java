public class q4 {
    // Objective - Given a range of numbers 1 to n, with n-1 numbers in the array, find the missing number.

    public static void main(String [] args) {
        int[] a = {1, 2, 4, 5, 6, 7, 8};
        int n = 8;

        int result = missingnumber(a, n);

        System.out.print(result); //3
    }

    public static int missingnumber(int[] a, int n) {
        // The checker array should be of size n, to account for all numbers from 1 to n
        boolean[] checker = new boolean[n];

        // Mark the numbers that are present in the array 'a'
        for (int i = 0; i < a.length; i++) {
            checker[a[i] - 1] = true;
        }

        // Find the missing number
        for (int i = 0; i < checker.length; i++) {
            if (!checker[i]) {
                return i + 1; // Return the missing number (since numbers are 1-based)
            }
        }

        return -1; // Return -1 if no missing number found (should not happen in valid input)
    }
}
