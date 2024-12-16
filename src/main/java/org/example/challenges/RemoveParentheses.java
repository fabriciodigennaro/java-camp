package org.example.challenges;

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
