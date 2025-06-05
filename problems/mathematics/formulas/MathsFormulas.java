package problems.mathematics.formulas;

public class MathsFormulas {
    public static void main(String[] args) {
        int n = 12;
        int k = 2;
        System.out.println("Sum from 1 to " + n + ": " + sumToN(n));
        System.out.println("Sum of GP (n=" + n + "): " + sumOfGP(12));
        System.out.println("Permutations of N = N! / (N-K)!, where N = " + n + " and K = " + k + permutations(n, k));
        System.out.println("Combinations of N = N! / (K! * (N-K)!), where N = " + n + " and K = " + k + combinations(n, k));
    }

    // Some common formulas

    // Sum of 1 to N = (n+1) * n/2
    public static int sumToN(int n) {
        return (n * (n + 1)) / 2;
    }

    // Sum of GP = 2⁰ + 2¹ + 2² + 2³ + … 2^n = 2^(n+1)-1
    public static long sumOfGP(int n) {
        return (1L << (n + 1)) - 1;  // Equivalent to 2^(n+1) - 1
    }

    // Permutations of N = N! / (N-K)!
    public static long permutations(int n, int k) {
        return factorial(n) / factorial(n - k);
    }

    // Combinations of N = N! / (K! * (N-K)!)
    public static long combinations(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // Helper: factorial
    public static long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}