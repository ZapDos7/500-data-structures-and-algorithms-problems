package other.longestSubstringNoRepeats;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeats {
    public static void main(String[] args) {
        String input = "abcabcbbc";
        // String input = "pwwkew";

        Map<Character, Integer> found = new HashMap<>(); // store char & last found index

        int start = 0; // window start index
        int maxLen = 0; // max length found so far
        int maxStart = 0; // start index of max substring

        for (int end = 0; end < input.length(); end++) {
            char curr = input.charAt(end);
            if (found.containsKey(curr) && found.get(curr) >= start) { // char was found & is in current window
                start = found.get(curr) + 1; // then start = right after last occurrence
            }
            found.put(curr, end);
            if (end - start + 1 > maxLen) { // if a longer one is found
                maxLen = end - start + 1; // update max substring length
                maxStart = start; // and start
            }
        }
        var result = input.substring(maxStart, maxStart + maxLen);

        System.out.println(result);
    }
}