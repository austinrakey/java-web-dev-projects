package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class StudioCounter {

public static void main (String[] args){

    HashMap<String, Integer> characterCounts = new HashMap<>();

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string");
    String scribblyNibbles = input.nextLine();

//    System.out.println(scribblynibbles.toLowerCase());
characterCounts.put(scribblyNibbles, 2);
    System.out.println(characterCounts.keySet() + ": " + characterCounts.values());


}
}
