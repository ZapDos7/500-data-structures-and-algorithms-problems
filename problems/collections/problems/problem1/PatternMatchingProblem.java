package problems.collections.problems.problem1;

import problems.collections.problems.Problem;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class PatternMatchingProblem implements Problem<Integer> {

    @Override
    public int getId() {
        return 1;
    }

    @Override
    public String getName() {
        return "Pattern Matching";
    }

    @Override
    public Integer mySolution(Object... args) {
        String source = (String) args[0];
        String word   = (String) args[1];
        return (int) Pattern.compile(word)
        .matcher(source.toLowerCase())
        .results()
        .count();
    }
    /*
     * Suggested solution:
     * 1. Remove periods
     * 2. Turn string to a list of strings
     * 3. Match & count
     */

    @Override
     public Integer suggested(Object... args) {
        String source = (String) args[0];
        String word   = (String) args[1];
        String cleanedUpString = source.replaceAll("\\.", "");
        return (int) Arrays.stream(cleanedUpString.split(" ")).filter(w -> w.equalsIgnoreCase(word)).count();
     }

    @Override
    public List<Object[]> demoInputs() {
        return List.of(
                new Object[]{"Here is an example. Right here.", "here"},
                new Object[]{"hello world hello", "hello"}
        );
    }
}
