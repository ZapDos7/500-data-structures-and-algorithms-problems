package problems.collections.runner;

import problems.collections.problems.Problem;
import problems.collections.problems.problem1.PatternMatchingProblem;
import problems.collections.problems.problem2.ReverseOrderProblem;
import problems.collections.problems.problem3.CalculateAverageProblem;
import problems.collections.problems.problem4.WordsWithCharsProblem;
import problems.collections.problems.problem5.IndicesOfSumProblem;

import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args){
        List<Problem> problems = List.of(
                new PatternMatchingProblem(),
                new ReverseOrderProblem(),
                new CalculateAverageProblem(),
                new WordsWithCharsProblem(),
                new IndicesOfSumProblem()
        );

        problems.stream()
                .sorted(Comparator.comparingInt(Problem::getId))
                .forEach(problem -> {
                    System.out.println("=== Problem " + problem.getId() + " ===");
                    problem.run();
                });
    }
}
