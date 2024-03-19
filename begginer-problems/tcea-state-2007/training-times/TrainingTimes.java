import java.util.List;

public class TrainingTimes {
    public static void main(String[] args) {
        /**write a program that can determine from a collection of two input recorded times if the user is improving. */

        int n = 3;
        List<String> input = List.of("500 450", "1000 1001", "75 75");
        for (int i = 0; i < n; i++) {
            var nums = input.get(i);
            var split = List.of(nums.split(" "));
            if (split.size() != 2) {
                System.err.println("Invalid input format");
            }
            if (Integer.parseInt(split.get(0)) > Integer.parseInt(split.get(1))) {
                System.out.println("IMPROVING");
            } else {
                System.out.println("NOT IMPROVING");
            }
        }
    }
}