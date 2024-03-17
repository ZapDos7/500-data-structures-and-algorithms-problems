// Given an integer array, print all subarrays with zero-sum (contiguous elemenets).

import java.util.ArrayList;
import java.util.List;

public class FindSubarraysZeroSums {
    public static void main(String[] args) {
        // user inputs array of numbers        
        List<Integer> input = List.of(4, 2, -3, -1, 0, 4);
        // return: { -3, -1, 0, 4 }{ 0 }

        //List<Integer> input = List.of(3, 4, -7, 3, 1, 3, 1, -4, -2, -2);
        // return: { 3, 4, -7 }{ 4, -7, 3 }{ -7, 3, 1, 3 }{ 3, 1, -4 }{ 3, 1, 3, 1, -4, -2, -2 }{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            for (int j = i; j < input.size(); j++) {
                List<Integer> subList = input.subList(Math.min(j, i), Math.max(j, i));
                var sumSoFar = subList.stream().reduce(0, Integer::sum);
                System.out.print("i: "+ i + " , j: " + j + " , sublist: "+ subList);
                System.out.println("\t\t" + sumSoFar);
                if (sumSoFar == 0 && subList.size() > 0) {
                    result.add(input.subList(i, j));
                }
            }
        }
        System.out.println("Result: " + result);
    }
}