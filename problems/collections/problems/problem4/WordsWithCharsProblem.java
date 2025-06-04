package problems.collections.problems.problem4;

import problems.collections.problems.Problem;

import java.util.Arrays;
import java.util.List;

public class WordsWithCharsProblem implements Problem<List<String>> {

    @Override
    public int getId() {
        return 4;
    }

    @Override
    public String getName() {
        return "Words with Characters";
    }

    @Override
    public List<String> mySolution(Object... args) {
        String source = args[0].toString();
        return Arrays.stream(source.split(" ")).filter(w -> w.length() < 6).toList();
    }

    @Override
    public List<String> suggested(Object... args) {
        String source = args[0].toString();
        return Arrays.stream(source.split(" ")).filter(w -> w.length() <= 5).toList();
    }

    @Override
    public List<Object[]> demoInputs() {
        return List.of(
                new Object[]{"a string of mostly smaller words"},
                new Object[]{"another string with words of varying sizes"}
        );
    }
}