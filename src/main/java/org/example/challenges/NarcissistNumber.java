package org.example.challenges;

/*
A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits, each raised to the
 power of the number of digits in a given base. In this Kata, we will restrict ourselves to decimal (base 10).

For example,

number 153 (3 digits), which is narcissistic: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

number 1652 (4 digits), which isn't:  1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938

The Challenge:
Your code must return true or false (not 'true' and 'false') depending upon whether the given number is a Narcissistic
number in base 10.

Error checking for text strings or other invalid inputs is not required, only valid positive non-zero integers will
be passed into the function.
 */

public class NarcissistNumber {
    public static boolean isNarcissistic(int number) {
        int result = 0;

        if (number <= 0) return false;

        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length(); i++) {
            char actualChar = numberString.charAt(i);
            int currentNumber = Character.getNumericValue(actualChar);
            result += (int) Math.pow(currentNumber, numberString.length());
        }
        return result == number;
    }
}
