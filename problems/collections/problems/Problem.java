package problems.collections.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public interface Problem<O> {
    int getId();
    String getName();
    O mySolution(Object... args);
    O suggested(Object... args);

    List<Object[]> demoInputs();

    /** Default harness: run every demo input, compare results. */
    default void run() {
        for (Object[] in : demoInputs()) {
            System.out.printf("Method: %s\n", getName());
            O mine = mySolution(in);
            O ref = suggested(in);
            System.out.printf(
                    "Input: %s\nMy Solution: %s\nSuggested Solution: %s\nPass: %b%n\n",
                    Arrays.toString(in), mine, ref, Objects.equals(mine, ref));
        }
        System.out.println();
    }
}
