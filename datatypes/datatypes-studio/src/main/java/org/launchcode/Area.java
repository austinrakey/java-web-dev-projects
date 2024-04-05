package org.launchcode;

import java.util.Scanner;

//import static org.launchcode.Circle.getArea;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");

        double radius = input.nextDouble();

//
//        while (!input.hasNextDouble()) {
//            System.out.println("Error: Please enter a numeric value.");
////            input.next();
//            radius = input.nextDouble();
//        }

//        double radius = input.nextDouble();


        System.out.println("The area of a cricle of radius " + radius + " is " + Circle.getArea(radius));

    }
}
