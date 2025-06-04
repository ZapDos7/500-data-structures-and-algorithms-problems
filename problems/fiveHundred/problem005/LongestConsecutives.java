// Given an integer array, find the largest subarray formed by consecutive integers. The subarray should contain all distinct values.
package problems.fiveHundred.problem005;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutives {
    public static void main(String[] args) {
        List<Integer> input = List.of(2, 0, 2, 1, 4, 3, 1, 0);
        // Output: The largest subarray is { 0, 2, 1, 4, 3 }

        int n = input.size();
        int maxLen = 0;
        int startIndex = 0;

        for (int i = 0; i < n; i++) {
            int minVal = input.get(i);
            int maxVal = input.get(i);

            Set<Integer> encountered = new HashSet<>();

            for (int j = i; j < n; j++) {
                var value = input.get(j);
                if (encountered.contains(value)) {
                    break;
                } else {
                    encountered.add(value);
                    minVal = Math.min(minVal, value);
                    maxVal = Math.max(maxVal, value);
                }
                if (maxVal - minVal == j - i) {
                    int len = j - i + 1;
                    if (len > maxLen) {
                        maxLen = len;
                        startIndex = i;
                    }
                }
            }
        }
        System.out.println("Largest subarray: " + input.subList(startIndex, startIndex + maxLen));
    }
}
