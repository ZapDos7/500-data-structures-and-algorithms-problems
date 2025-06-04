// Given a limited range array of size n containing elements between 1 and n-1 with one element repeating, find the duplicate number in it without using any extra space.
package fiveHundred.problem004;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4, 4);
        // Output: 4

        //Input 2
        // List<Integer> input = List.of(1, 2, 3, 4, 2);
        // Output: 2

        Map<Integer, Integer> copies = new HashMap<>();
        for (Integer i : input) {
            if (copies.containsKey(i)) {
                copies.put(i, copies.get(i) + 1);
            } else {
                copies.put(i, 1);
            }
        }
        copies.forEach((k,v) -> {
            if (v > 1) {
                System.out.println("Duplicate: " + k);
            }
        });
    }
}