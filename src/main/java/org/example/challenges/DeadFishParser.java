package org.example.challenges;

import java.util.ArrayList;
import java.util.List;

public class DeadFishParser {
    /*
        Write a simple parser that will parse and run Dead fish.

        Dead fish has 4 commands, each 1 character long:

        i- increments the value (initially 0)
        d- decrements the value
        s- squares the value
        o- outputs the value into the return array

        Invalid characters should be ignored.

        example:  "iiisdoso" should return {8, 64}
     */
    public static int[] parse(String data) {
        String[] arrOfStr = data.split("");
        List<Integer> result = new ArrayList<>(List.of());
        int value = 0;

        for (String s : arrOfStr) {
            switch (s) {
                case "i":
                    value += 1;
                    break;
                case "d":
                    value -= 1;
                    break;
                case "s":
                    value = value * value;
                    break;
                default:
                    result.add(value);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
