package com.pluralsight.getorganized;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.*;
import java.io.*;
import static java.util.stream.Collectors.toCollection;

class Main {

    public static String FindIntersection(String[] strArr) {

        TreeSet<Integer> set1 = Arrays.stream(strArr[0].replace(" ", "").split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
        TreeSet<Integer> set2 = Arrays.stream(strArr[1].replace(" ", "").split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
        set1.retainAll(set2);

        return (set1.isEmpty() ? "false" : Arrays.toString(new TreeSet<>(set1).toArray()).replace("]", "").replace("[", "").replace(" ", ""));
    }

    public static void main(String[] args) {
        // keep this function call here

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your string1: ");

        // takes input from the keyboard
        String name1 = input.nextLine();

        System.out.print("Enter your string2: ");
        String name2 = input.nextLine();


        // prints the name

        System.out.println("My string1 is " + name1);
        System.out.println("My string2 is " + name2);

        //System.out.print(FindIntersection(name);

        // closes the scanner
        input.close();


        //Scanner s = new Scanner(System.in);
        //String[] strArray = new String[1];
        //strArray[0] = s.nextLine();
        String[] strArray = {name1, name2};
        System.out.print(FindIntersection(strArray));
    }
}
