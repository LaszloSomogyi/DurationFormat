
package durationformat;

import java.util.Stack;

public class DurationFormat {

    public static void main(String[] args) {

    }

    public static String durationFormat(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Argument cannot be less than zero.");
        }
        if (seconds == 0) {
            return "now";
        }
        int[] metric = {60, 60, 24, 365};
        //Verembe töltöm az értékeket
        Stack<Integer> stack = new Stack<>();
        int nonZeroItems = 0;
        for (int i = 0; i < 4; i++) {
            stack.push(seconds % metric[i]);
            //megszámlálom, hogy hány db. nem nulla értékű elem kerül a verembe
            if (seconds % metric[i] != 0) {
                nonZeroItems++;
            }
            seconds /= metric[i];
        }
        //hozzáadom az éveket is
        if (seconds != 0) {
            nonZeroItems++;
        }
        stack.push(seconds);
        //Stringet építek a kiíratáshoz
        String[] measures = {"year", "day", "hour", "minute", "second"};
        StringBuilder stBuilder = new StringBuilder();
        for (int i = 0; i < measures.length; i++) {
            if (stack.peek() != 0) {
                stBuilder.append(stack.peek());
                stBuilder.append(" ");
                stBuilder.append(measures[i]);
                if (stack.peek() > 1) {
                    stBuilder.append("s");
                }
                if (nonZeroItems > 2) {
                    stBuilder.append(",");
                }
                if (nonZeroItems == 2) {
                    stBuilder.append(" and");
                }
                stBuilder.append(" ");
                nonZeroItems--;
            }
            stack.pop();
        }
        String formatted = stBuilder.toString();
        formatted = formatted.trim();
        return formatted;
    }

}
