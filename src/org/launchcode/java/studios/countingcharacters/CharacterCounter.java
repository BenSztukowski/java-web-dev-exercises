package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        System.out.println("Want to use your own string? Type it below or just press enter to use default:");
        String text = "If the product of two terms is zero then common sense" +
                " says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the" +
                " quadratics into a form that can be factored allowing that side of the equation" +
                " to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

//        Scanner input = new Scanner(System.in);
//        if (input )
//        text = input.nextLine();


        char[] charactersInString = text.toCharArray();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char c : charactersInString){
            if (letterCount.containsKey(c)){
                letterCount.replace(c, (letterCount.get(c)), letterCount.get(c)+1);
            } else {
                letterCount.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> chars : letterCount.entrySet()) {
            System.out.println(chars.getKey() + " - " + chars.getValue());
        }
    }
}
