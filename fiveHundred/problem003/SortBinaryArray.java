// Given a binary array, sort it in linear time and constant space. The output should print all zeros, followed by all ones.
package fiveHundred.problem003;

import java.util.*;
import java.util.stream.*;

public class SortBinaryArray {
    public static void main(String[] args) {
        // user inputs array of 0 & 1
        List<Integer> input = List.of(1, 0, 1, 0, 1, 0, 0, 1);
        // return:  { 0, 0, 0, 0, 1, 1, 1, 1 }

        int countZeros = Math.toIntExact(input.stream().filter(i -> i == 0).count());
        int countOnes = Math.toIntExact(input.stream().filter(i -> i == 1).count());

        List<Integer> result = Stream.concat(
                Collections.nCopies(countZeros, 0).stream(),
                Collections.nCopies(countOnes, 1).stream()).toList();
        System.out.println("Result: " + result);
    }
}