package problems.strings.guess;

public class TrickyInterviewProblems {
    public static void main(String[] args) {
        // Q1
        int a = 5;
        int b = 10;
        System.out.println(a++ + ++b);
        // Prints 16
        // a: post increment so it becomes 6 after execution
        // b: pre increment so it becomes 11 before execution
        // 5 + 11 = 16
        // after execution, it becomes 17

        // Q2
        String str = null;
        if (str instanceof String) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Prints False because of instanceof
        // If obj is null, instance of always returns null
        // Otherwise instanceof checks for instance of the specified type.

        // Q3
        int x = 10;
        int y = (x > 5) ? (x < 10 ? 1 : 2) : 3;
        System.out.println(y);
        // Prints 2
        // Explanation:
            // innermost parentheses
            // if x < 10, then 1 else 2
            // since x = 10, innermost returns 2
        // updated: (x > 5) ? 2 : 3
        // (x>5) --> (10>5) --> true so we return 2
    }
}
