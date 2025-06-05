package problems.binary;

import java.util.ArrayList;
import java.util.List;

public class HammingWeight {
// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).
    public static void main(String[] args) {
        System.out.println(getHammingWeight(11));
        System.out.println(getHammingWeight2(11));
    }

    // Bit Logic
    static int getHammingWeight2(int input) {
        int res = 0;
        while (input != 0) {
            res += input & 1;  // Add the least significant bit
            input >>>= 1;      // Unsigned right shift to handle negative numbers correctly
        }
        return res;
    }

    // String logic
    static int getHammingWeight(int input) {
        var toBinary = Integer.toBinaryString(input);
//        System.out.println("Input: " + input + " is " + toBinary + " in binary format");
        int result = toCharList(toBinary).stream().filter(i -> i == '1').toList().size();
//        System.out.println("Found " + result + " set bits");
        return result;
    }

    private static List<Character> toCharList(String inputString) {
        char[] charArray = inputString.toCharArray();

        List<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }

        return charList;
    }

    /**
     * The binary expression to test if the k-th bit is set is:
     * num & (1 << k) != 0
     * */
}
