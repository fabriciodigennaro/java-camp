package org.example.challenges;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstUnique {

//    given an array of integers, the solution needs to return the first unique integer found in the array
//    a unique integer is an integer that doesn't repeat in the array

    public Optional<Integer> solution(int[] input) {
//        return solutionQuadratic(input);
        return solutionLinear(input);
    }

    private Optional<Integer> solutionLinear(int[] input) {
        Map<Integer, Integer> inputCounter = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            int targetNumber = input[i];
            int previousValue = inputCounter.getOrDefault(targetNumber, 0);
            inputCounter.put(targetNumber, previousValue + 1);
        }
        return inputCounter.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    private Optional<Integer> solutionQuadratic(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int targetNumber = input[i];
            boolean isRepeated = false;

            for (int j = 0; j < input.length; j++) {
                 if (targetNumber == input[j] && i != j) {
                     isRepeated = true;
                     break;
                 }
            }
            if (!isRepeated) {
                return Optional.of(targetNumber);
            }
        }
//        throw new IllegalArgumentException();
        return Optional.empty();
    }
}
