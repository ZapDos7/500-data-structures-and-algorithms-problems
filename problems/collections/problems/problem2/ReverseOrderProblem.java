package problems.collections.problems.problem2;

import problems.collections.problems.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOrderProblem implements Problem<List<Integer>> {

    @Override
    public int getId() {
        return 2;
    }

    @Override
    public String getName() {
        return "Reverse Order";
    }

    @Override
    public List<Integer> mySolution(Object... args) {
        @SuppressWarnings("unchecked")
        List<Integer> input = new ArrayList<>((List<Integer>) args[0]);
        Collections.reverse(input);
        return input;
    }

    @Override
    public List<Integer> suggested(Object... args) {
        @SuppressWarnings("unchecked")
        List<Integer> result = new ArrayList<>((List<Integer>) args[0]);
        Collections.reverse(result);
        return result;
    }

    @Override
    public List<Object[]> demoInputs() {
        return List.of(
                new Object[]{Arrays.asList(2, 5, 20, 30, 56)},
                new Object[]{Arrays.asList(-20, 30, -56)}
        );
    }
}