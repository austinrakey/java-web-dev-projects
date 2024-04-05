package org.launchcode;
import java.util.Scanner;


public class NumericTypes {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?:");

        double length = input.nextDouble();
        System.out.println(length * length);
    }
}
