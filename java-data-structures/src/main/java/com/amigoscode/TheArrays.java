package com.amigoscode;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TheArrays {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();

        // Traverse through the first list
        for (T element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        // return the new list
        return newList;
    }
    public static void main(String[] args) {

        // Get the ArrayList with duplicate values
        ArrayList<String> list = new ArrayList<>(Arrays.asList("perro", "gato", "elefante", "mono", "perro"));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: " + list);

        // Remove duplicates
        ArrayList<String> newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + newList);

        System.out.println(newList.size());

        long n = list.stream().distinct().count();
        System.out.println(n);
    }
}
