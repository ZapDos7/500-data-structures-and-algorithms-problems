package problems.collections.problems.problem3;

import problems.collections.problems.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculateAverageProblem implements Problem<Double> {

    @Override
    public int getId() {
        return 3;
    }

    @Override
    public String getName() {
        return "Calculate Average";
    }

    @Override
    public Double mySolution(Object... args) {
        @SuppressWarnings("unchecked")
        List<Integer> input = new ArrayList<>((List<Integer>) args[0]);
        return input.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

    @Override
    public Double suggested(Object... args) {
        @SuppressWarnings("unchecked")
        List<Integer> input = new ArrayList<>((List<Integer>) args[0]);
        if (input == null || input.isEmpty()) {
            return 0.0;
        }
        return input.stream().reduce(0, Integer::sum) / (double) input.size();
    }

    @Override
    public List<Object[]> demoInputs() {
        return List.of(
                new Object[]{Arrays.asList(2, 5, 20, 30, 56)},
                new Object[]{Arrays.asList(-20, 30, -56)}
        );
    }
}