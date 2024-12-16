package org.example.challenges;
/*
https://www.codewars.com/kata/5f7c38eb54307c002a2b8cc8/train/java

In this kata you are given a string for example:

"example (unwanted thing)example"
Your task is to remove everything inside the parentheses as well as the parentheses themselves.

The example above would return:

"example example"
 */
public class RemoveParentheses {
    // OPTION 1 REGEX and while:
//    public static String removeParentheses(final String str) {
//        String result = replaceParentheses(str);
//        while (result.contains("(")) {
//            result = replaceParentheses(result);
//        }
//        return result;
//    }
//
//    private static String replaceParentheses(String string) {
//        return string.replaceAll("\\([^()]*\\)", "");
//    }

    // OPTION 2 REGEX and recursive method:
    public static String removeParentheses(final String str) {
        return removeParenthesesRecursive(str);
    }

    private static String removeParenthesesRecursive(String str) {
        String result = str.replaceAll("\\([^()]*\\)", "");
        if (result.contains("(")) {
            return removeParenthesesRecursive(result);
        }
        return result;
    }
}
