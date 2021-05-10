package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class FindSum {

    public static int findSum(ArrayList<Integer> numList){
        int sum = 0;
        for (int i = 0; i < numList.size(); i++){
            if (numList.get(i)%2 == 0){
                sum+= numList.get(i);
            }
        }
        return sum;
    }

    public static void printFives(ArrayList<String> text){
        int howLong = 5;
        System.out.println("How long do you want the words printed?:");
        Scanner input = new Scanner(System.in);
        howLong = input.nextInt();

        for (int i = 0; i < text.size(); i++){
            if (text.get(i).length() == howLong){
                System.out.println(text.get(i));
            }
        }
    }
}
