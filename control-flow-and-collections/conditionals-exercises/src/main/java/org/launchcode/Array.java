package org.launchcode;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < 6; i++ ) {

            if (integerArray[i] % 2 != 0){
                System.out.println(integerArray[i]);

            }
        }

//        for (int i : integerArray) {
//            System.out.println(i);
//        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
//        System.out.println(words);

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));


    }
}