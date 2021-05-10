package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;

public class Arrayexercise1 {
    public static void main(String[] args) {
//        int[] singleLine = new int[]{1, 1, 2, 3, 5, 8};
//        for (int i = 1; i < singleLine.length; i +=2){
//            System.out.println(singleLine[i]);
//        }
        String sentence = "I would not, could not, in a box. I would not," +
                " could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] cuts = sentence.split(" ");
//        System.out.println(Arrays.toString(cuts));
        String[] sentences = sentence.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}
