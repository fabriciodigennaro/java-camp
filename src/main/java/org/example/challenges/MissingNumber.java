package org.example.challenges;

import java.util.Arrays;

public class MissingNumber {
    /**
     * Given an array nums containing n distinct numbers in the range [0, n],
     * return the only number in the range that is missing from the array.
     *
     * Example 1:
     * Input: nums = [3,0,1]
     * Output: 2
     * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
     * 2 is the missing number in the range since it does not appear in nums.
     *
     * Example 2:
     * Input: nums = [0,1]
     * Output: 2
     * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
     * 2 is the missing number in the range since it does not appear in nums.
     *
     * Example 3:
     *
     * Input: nums = [9,6,4,2,3,5,7,0,1]
     * Output: 8
     * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
     * 8 is the missing number in the range since it does not appear in nums.
     */

    public int solution(int[] input) {
//        return solution1(input);
        return solution2(input);

    }

    private int solution1(int[] input) {
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            if(input[i] != i) {
                return i;
            }
        }
        return input.length;
    }

    private int solution2(int[] input) {
        int targetSum = input.length;
        for (int i = 0; i < input.length; i++) {
            targetSum += i;
            targetSum -= input[i];
        }
        return targetSum;
    }
}
