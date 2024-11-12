package org.example.challenges;

/*
In this kata you have to correctly return who is the "survivor", ie: the last element of a Josephus permutation.

Basically you have to assume that n people are put into a circle and that they are eliminated in steps of k elements.
like this:

n=7, k=3 => means 7 people in a circle
one every 3 is eliminated until one remains
[1,2,3,4,5,6,7] - initial sequence
[1,2,4,5,6,7] => 3 is counted out
[1,2,4,5,7] => 6 is counted out
[1,4,5,7] => 2 is counted out
[1,4,5] => 7 is counted out
[1,4] => 5 is counted out
[4] => 1 counted out, 4 is the last element - the survivor!


 */

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> peopleInCircle = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            peopleInCircle.add(i);
        }

        int index = 0;
        while (peopleInCircle.size() > 1) {
            index = (index + k - 1) % peopleInCircle.size();
            peopleInCircle.remove(index);
        }

        return peopleInCircle.get(0);
    }
}
