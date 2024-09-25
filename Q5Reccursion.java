public class q5reccursive {
    public static void main(String[] args) {
        int n = 30; // Example for 30th Fibonacci number
        System.out.println("The fibonacci term is" + fibonacciRecursive(n));//832040
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n; // Handle base cases
        int fibn=fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Recursive call
        return fibn;
    }
}
