package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListpractice {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int total = FindSum.findSum(numbers);
        System.out.println(total);

        String exercise1 = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitUp = exercise1.split(" ");
        ArrayList<String> finalSplit = new ArrayList<>(Arrays.asList(splitUp));
        FindSum.printFives(finalSplit);


        ArrayList<String> someWords = new ArrayList<>(Arrays.asList("flip", "nugget", "drive", "a", "House"));
        FindSum.printFives(someWords);
    }


}
