package problems.beginner.oneLoop;

public class OneLoopDesign {
    /**
     * Write a code to make this design below using one loop:
1           *
2          **
3         ***
4        ****
5       *****
6      ******
7     *******
8    ********
9   *********
10 **********

source: https://tausiq.wordpress.com/2009/08/21/one-loop-design/
     */

     public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
         String spaces = " ".repeat(10-i);
         String stars = "*".repeat(i);
         System.out.println(spaces + stars);
      }
     }
    }