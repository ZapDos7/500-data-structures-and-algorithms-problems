package problems.binary;

public class BitManipulation {
    public static void main(String[] args) {
        int num = 42; // 0b101010
        int k = 1;

        System.out.println("Original: " + Integer.toBinaryString(num));
        System.out.println("Set k-th: " + Integer.toBinaryString(setKthBit(num, k)));
        System.out.println("Clear k-th: " + Integer.toBinaryString(clearKthBit(num, k)));
        System.out.println("Toggle k-th: " + Integer.toBinaryString(toggleKthBit(num, k)));
    }


    // Set the k-th bit (0-indexed)
    public static int setKthBit(int num, int k) {
        return num | (1 << k); // num |= (1 << k)
    }

    // Turn off (clear) the k-th bit
    public static int clearKthBit(int num, int k) {
        return num & ~(1 << k); // num &= ~(1 << k)
    }

    // Toggle the k-th bit
    public static int toggleKthBit(int num, int k) {
        return num ^ (1 << k); // num ^= (1 << k)
    }
}
