package com.coding.arrays;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new int[2];
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int left = nums[start];
            int right = nums[end];
            if (left + right == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (left + right < target) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
