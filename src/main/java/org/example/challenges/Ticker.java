package org.example.challenges;

/*
Let's implement a function which will return a chunk of text to be displayed on a display of fixed width.
The function should take text to display, width of the display and tick as a step of the ticker.
The function will be called many times with tick parameter constantly incrementing.

At very beginning the display is empty. At first step only one character should be displayed in the most right
position and so on. When the message is displayed, it should disappear char by char to left position and return
to blank state of the display. After that cycle should start again.

For example

ticker("Hello world!", 10, 4)   // "      Hell"
 */

public class Ticker {
    public static String ticker(String text, int width, int tick) {
        String padding = " ".repeat(width);
        String fullMessage = padding + text + padding;

        int cycleLength = text.length() + width;
        int startIndex = tick % cycleLength;

        return fullMessage.substring(startIndex, startIndex + width);
    }
}
