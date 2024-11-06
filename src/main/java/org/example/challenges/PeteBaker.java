package org.example.challenges;

import java.util.Map;

/*
Pete likes to bake some cakes. He has some recipes and ingredients. Unfortunately he is not good in maths.
Can you help him find out, how many cakes he could bake considering his recipes?

Write a function cakes(), which takes the recipe (object) and the available ingredients (also an object) and returns
the maximum number of cakes Pete can bake (integer). For simplicity there are no units for the amounts
(e.g. 1 lb of flour or 200 g of sugar are simply 1 or 200).
Ingredients that are not present in the objects, can be considered as 0.

Examples:

// must return 2
recipe= flour: 500, sugar: 200, eggs: 1
available = flour: 1200, sugar: 1200, eggs: 5, milk: 200
// must return 0
recipe= apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100
available= sugar: 500, flour: 2000, milk: 2000
 */

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int maximumBakesPossible = -1;

        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            int currentIngredientNeeded = entry.getValue();
            int currentIngredientAvailable = available.getOrDefault(entry.getKey(), 0);
            int maxPossiblePerIngredient = currentIngredientAvailable / currentIngredientNeeded;

            if (maximumBakesPossible == -1 || maximumBakesPossible >= maxPossiblePerIngredient) {
                maximumBakesPossible = maxPossiblePerIngredient;
            }
        }

        return maximumBakesPossible;
    }
}
