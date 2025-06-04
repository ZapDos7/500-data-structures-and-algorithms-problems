package other.interview;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        * Given an integer n, for every positive integer i <= n, the task is to print,
        * "FizzBuzz" if i is divisible by 3 and 5,
        * "Fizz" if i is divisible by 3,
        * "Buzz" if i is divisible by 5
        * "i" as a string, if none of the conditions are true.
        * */

        int n = 20;
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder();
            if (i % 3 == 0) {
                s.append("Fizz");
            }
            if (i % 5 == 0) {
                s.append("Buzz");
            }
            if (s.length() == 0) {
                s.append(i);
            }
            result.add(s.toString());
        }

        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
