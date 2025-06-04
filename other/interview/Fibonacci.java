package other.interview;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // how many numbers do we want?
        printFibonacci(n);
    }

    static void printFibonacci(int N)
    {
        int n1 = 0, n2 = 1;

        for (int i = 0; i < N; i++) {
            // Print
            System.out.print(n1 + " ");
            // Swap
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }
}
