//Find a pair with the given sum in an array
package fiveHundred.problem001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner; 

public class FindPairInArrayBasedOnSum {
    public static void main(String[] args) {
        // user inputs array of numbers        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide array of positive integers separated by new lines (type '-1' to finish)");
        int i = 0;
        List<Integer> ints = new ArrayList<>();
        while (i != -1) {
            i = scan.nextInt();
            if (i != -1) {
                ints.add(i);
                // System.out.println(i);
            }
        }
        // user inputs desired sum
        int sum = -1;
        while (sum <= 0) {
            System.out.println("Please provide a positive integer as the desired sum for the calculations: ");
            sum = scan.nextInt();
        }

        // calculations
        // System.out.println("ints: " + ints + "\nsum:" + sum);
        calculate(ints, sum);

        // print result, clean up
        scan.close();
    }

    private static void calculate(List<Integer> ints, int sum) {
        Collections.sort(ints);
        int low = 0;
        int high = ints.size() - 1;
        while (low < high)
        {
            // sum found
            if (ints.get(low) + ints.get(high) == sum)
            {
                System.out.println("Pair found (" + ints.get(low) + ", " + ints.get(high) + ")\n");
                return;
            }
 
            if (ints.get(low) + ints.get(high) < sum) {
                low++; // increment `low` index if the total is less than the desired sum;
            }
            else {
                high--; // decrement `high` index if the total is more than the desired sum
            }
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
}