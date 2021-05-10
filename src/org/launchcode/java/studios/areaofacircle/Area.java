package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        System.out.println("Enter the radius of a circle whose area you want calculated:");
        Double radius = 0.0;
        while (true){
            Scanner input = new Scanner(System.in);
            if (input.hasNextDouble()){
                radius = input.nextDouble();
                Double area = Circle.getArea(radius);
                System.out.println("The area of the circle with radius " + radius + " is " + area + "square units");
            } else {
                System.out.println("Not a nubmer, blockhead.");
            }
        }
    }
}
