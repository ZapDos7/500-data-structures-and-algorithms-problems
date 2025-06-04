package problems.collections.problems.problem5;

import problems.collections.problems.Problem;

import java.util.*;

public class IndicesOfSumProblem implements Problem<List<Integer>> {

    @Override
    public int getId() {
        return 5;
    }

    @Override
    public String getName() {
        return "Indices of Sum";
    }

    /* Given a List of Integers and a target sum,
    return the indices of the two numbers in the array that,
    when summed, return the target number. */

    @Override
    public List<Integer> mySolution(Object... args) {
        @SuppressWarnings("unchecked")
        List<Integer> source = (List<Integer>) args[0];
        int target = (int) args[1];
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            var element = source.get(i);
            var diff = target - element;
            if (source.contains(diff)) {
                indices.add(source.indexOf(element));
                indices.add(source.indexOf(diff));
                break;
            }
        }
        return indices;
    }

    @Override
    public List<Integer> suggested(Object... args) {
        @SuppressWarnings("unchecked")
        List<Integer> source = (List<Integer>) args[0];
        int target = (int) args[1];
        Map<Integer, Integer> sourceMap = new HashMap<>();
        for (int i = 0; i < source.size(); i++) {
            sourceMap.put(source.get(i), i);
        }
        for (int i = 0; i < source.size(); i++) {
            int solutionNumber = target - source.get(i);
            if (sourceMap.containsKey(solutionNumber) && sourceMap.get(solutionNumber)!=i) {
                // if it exists in the map and it's not the currently checked number
                return Arrays.asList(i,sourceMap.get(solutionNumber));
            }
        }
        return Arrays.asList(-1,-1); //default
    }

    @Override
    public List<Object[]> demoInputs() {
        List<Integer> input1 = Arrays.asList(1, 2, 3);
        int target1 = 3;
        List<Integer> input2 = Arrays.asList(4, 5, 6, 8);
        int target2 = 13;
        return List.of(
                new Object[]{input1, target1},
                new Object[]{input2, target2}
        );
    }
}