package com.coding.strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class Anagram {
    private static final Logger LOGGER = Logger.getLogger(Anagram.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Enter first String: ");
        String firstString = scanner.next();
        LOGGER.info("Enter Second String: ");
        String secondString = scanner.next();
        if (anagramCheck(firstString, secondString)) {
            System.out.println(firstString + " and " + secondString + " are anagram");
        } else {
            System.out.println(firstString + " and " + secondString + " are not anagram");
        }
    }

    private static boolean anagramCheck(String firstString, String secondString) {
        String s1 = firstString.replace("\\s", "");
        String s2 = secondString.replace("\\s", "");
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            return Arrays.equals(s1Array, s2Array);
        }
    }
}
