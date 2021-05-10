package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ANewGradebook {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        String name;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter new student name:");
            name = input.nextLine();
            if (!name.equals("")){
                System.out.println("ID Number:");
                Scanner number = new Scanner(System.in);
                Integer id = number.nextInt();
                students.put(name, id);
            }
        } while (!name.equals(""));

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
