package org.example.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuddyStrings {

    /*
      Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal,
      otherwise, return false.

      Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and
      swapping the characters at s[i] and s[j].

      For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

      Example 1:
      Input: s = "ab", goal = "ba"
      Output: true
      Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

      Example 2:
      Input: s = "ab", goal = "ab"
      Output: false
      Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.

      Example 3:
      Input: s = "aa", goal = "aa"
      Output: true
      Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
     */

    public boolean solution(String s, String goal) {
        return solution2(s, goal);
    }

    private boolean solution1(String s, String goal) {

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                int[] swappedString = s.chars().toArray();
                int swapJ = swappedString[j];
                swappedString[j] = swappedString[i];
                swappedString[i] = swapJ;
                StringBuilder result = new StringBuilder();
                Arrays.stream(swappedString).forEach(letter -> result.append((char) letter));

                if (result.toString().equals(goal)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean solution2(String s, String goal) {

        List<Integer> indexesToSwap = new ArrayList<>();
        boolean areLettersRepeated = false;
        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charGoal = goal.charAt(i);
            if (charS != charGoal) {
                indexesToSwap.add(i);
            }
            int count = counter.getOrDefault(charS, 0) + 1;
            if (count > 1) {
                areLettersRepeated = true;
            }
            counter.put(charS, count);
        }

        if (indexesToSwap.size() == 2) {
            int[] swappedString = s.chars().toArray();
            int firstIndex = indexesToSwap.get(0);
            int secondIndex = indexesToSwap.get(1);
            int swapLetter1 = swappedString[firstIndex];
            swappedString[firstIndex] = swappedString[secondIndex];
            swappedString[secondIndex] = swapLetter1;
            StringBuilder result = new StringBuilder();
            Arrays.stream(swappedString).forEach(letter -> result.append((char) letter));
            return result.toString().equals(goal);
        }

        return indexesToSwap.isEmpty() && areLettersRepeated;
    }

}
