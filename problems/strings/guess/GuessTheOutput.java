package problems.strings.guess;

import java.io.IOException;
import java.util.HashSet;

public class GuessTheOutput {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is:" + s1 == s2);

        // The output of the given statement is false
        // because the + operator has a higher precedence
        // than the == operator.
        // So the given expression is evaluated to “s1 == s2 is:abc” == “abc”, which is false.

        //

        String s3 = "JournalDev";
        int start = 1;
        char end = 5;

        System.out.println(s3.substring(start, end));

        // ourn because end -1
        //

        HashSet shortSet = new HashSet();

        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i - 1);
        }

        System.out.println(shortSet.size());

        //The size of the shortSet is 100. The autoboxing feature in Java means that the expression i, which has the primitive type short, converts to a Short object. Similarly, the expression i - 1 has the primitive type int and is autoboxed to an Integer object. Since there is no Integer object in the HashSet, nothing is removed and the size is 100.

        //
        boolean flag = false;
        try {
            if (flag) {
                while (true) {
                }
            } else {
                System.exit(1);
            }
        } finally {
            System.out.println("In Finally");
        }
//No output. This code results in an infinite loop if the flag is true and the program exists if the flag is false. The finally block will never be reached.

        //

        String str = null;
        String str1="abc";

        System.out.println(str1.equals("abc") | str.equals(null));
// NPE
        //

        String x = "abc";
        String y = "abc";

        x.concat(y);

        System.out.print(x);
        //The x.concat(y) creates a new string but is not assigned to x, so the value of x is not changed.

        //

        int x1 = 10 * 10 - 10;

        System.out.println(x1);

        //

        try {
            throw new IOException("Hello");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// source: https://www.digitalocean.com/community/tutorials/java-programming-interview-questions#42-49-guess-the-output