package problems.binary;

public class BinaryCheckIfPower {
    public static void main(String[] args) {
        int num = 16;
        String response = "Number " + num + (check(num) ? " is a power of 2" : " is NOT a power of 2");
        System.out.println(response);
    }

    // Check if a number is a power of 2:
    public static boolean check(int num) {
        return (num & (num - 1)) == 0; // num & num - 1 == 0.
    }
}
