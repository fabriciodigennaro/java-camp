package org.example.challenges;

import java.util.HashMap;
import java.util.Map;

public class FindTwoSum {

    // Linear Solution
    public static class LinearSolution {
        public static int[] twoSum(int[] numbers, int target) {
            int[] result = new int[2];

            Map<Integer, Integer> previousNumbers = new HashMap<>();

            for (int i = 0; i < numbers.length; i++) {

                int missingNumber = target - numbers[i];

                if (previousNumbers.containsKey(missingNumber)) {
                    result[0] = previousNumbers.get(missingNumber);
                    result[1] = i;
                    return result;
                }
                previousNumbers.put(numbers[i], i);
            }
            return result;

        }

    }

    // Quadratic Solution
    public static class QuadraticSolution {
        public static int[] twoSum(int[] numbers, int target) {
            int[] result = new int[2];

            for (int i = 0; i < numbers.length; i++) {

                for (int j = i + 1; j < numbers.length; j++) {
                    int currentNumber = numbers[i];
                    int numberToCompare = numbers[j];
                    if ((currentNumber + numberToCompare) == target) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
            return result;
        }
    }
}
