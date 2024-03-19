import java.util.List;

public class NextNumber {
    public static void main(String[] args) {
        int n = 3;
        List<String> input = List.of("7 21 35", "-10 20 -40", "64 16 4");
        for (int i = 0; i < n; i++) {
            var element = input.get(i);
            List<Integer> numbers = List.of(element.split(" ")).stream().map(k -> Integer.parseInt(k)).toList();
            if (numbers.size() != 3) {
                System.err.println("Invalid input format");
            }
            Integer x = numbers.get(0);
            Integer y = numbers.get(1);
            Integer z = numbers.get(2);
            if (y - x == z - y) {
                System.out.println(z + y - x);
            } else if (y / x == z / y) {
                System.out.println((int)((double) z /(double) ((double) x /(double) y)));
            } else {
                System.err.println("Invalid input format");
            }
        }
    }    
}
