import java.util.List;

public class AnythingYouCanDo {
    public static void main(String[] args) {
        int n = 3;
        List<String> input = List.of("warm", "smaller", "rare");
        for (int i = 0; i < n; i++) {
            var element = input.get(i);
            var length = element.length();
            if (element.charAt(length-1) == 'e') {
                System.out.println(element+"r");
            } else if (element.charAt(length-1) == 'r' && element.charAt(length-2) == 'e') {
                System.out.println(element.substring(0, length-1)+"st");
            } else {
                System.out.println(element+"er");
            }
        }
    }    
}
