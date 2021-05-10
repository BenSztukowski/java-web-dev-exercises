package exercises;

import java.util.Scanner;

public class MPG {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?:");
        Integer miles = input.nextInt();
        System.out.println("How many gallons have you used?:");
        Integer gallons = input.nextInt();
        System.out.println("Your miles per gallon (MPG) is: " + (miles/gallons));
    }
}
