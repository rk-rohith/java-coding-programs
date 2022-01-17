package com.coding.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = {2, 60, 45, 6, 456, 766, 334, 34};
        int largest = 0;
        for (int j : array) {
            if (j >= largest) {
                largest = j;
            }
        }
        System.out.println(largest);
    }
}
