package com.coding.arrays;

import java.util.Arrays;

public class FirstLastIndexElement {
    public static void main(String[] args) {
        int nums[] = {2, 4, 5, 5, 5, 5, 5, 7, 9};
        int target = 5;
        final int[] range = searchRange(nums, target);
        System.out.println(Arrays.toString(range));
    }

    public static int[] searchRange(int[] nums, int target) {
        int results[] = new int[2];
        results[0] = findStartingIndex(nums, target);
        results[1] = findEndingIndex(nums, target);
        return results;
    }


    private static int findStartingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int midPoint = start + (end - start) / 2;
            if (nums[midPoint] >= target) {
                end = midPoint - 1;
            } else
                start = midPoint + 1;

            if (nums[midPoint] == target)
                index = midPoint;
        }
        return index;
    }

    private static int findEndingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int midPoint = start + (end - start) / 2;
            if (nums[midPoint] <= target) {
                start = midPoint + 1;
            } else
                end = midPoint - 1;

            if (nums[midPoint] == target)
                index = midPoint;
        }
        return index;
    }
}
