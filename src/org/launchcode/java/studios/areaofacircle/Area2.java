package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        double area = Circle2.getArea(radius);
        input.close();
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
