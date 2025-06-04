package problems.mathematics.coins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coins {
    /*
    * Write a function that takes in a number of cents (EUR) as an integer less than or equal to 100, and prints out the least amount of coins needed to represent it.
    * 50 => 1 coin of 50 cents
    * 11 => 1 coin of 10 cents & 1 coin of 1 cent
    * 7 => 1 coin of 5 cents & 1 coin of 2 cent
     * */
    public static void main(String[] args) {
        int cents = 58;

        if (cents < 0 || cents > 100) {
            System.out.println("Amount must be between 0 and 100 cents.");
            return;
        }

        List<Integer> coinValues = List.of(50, 20, 10, 5, 2, 1);
        List<Integer> coinCount = new ArrayList<>(Collections.nCopies(6, 0));

        int remaining = cents;

        for (int i = 0; i < coinValues.size(); i++) {
            coinCount.set(i, remaining / coinValues.get(i));
            remaining %= coinValues.get(i);
        }

        System.out.println("Minimum coins for " + cents + " cents:");
        for (int i = 0; i < coinValues.size(); i++) {
            if (coinCount.get(i) > 0) {
                System.out.println(coinCount.get(i) + " coin(s) of " + coinValues.get(i) + " cents");
            }
        }
    }
}
