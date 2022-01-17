package com.coding.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        final int[] twoSum = findTwoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));
    }

    private static int[] findTwoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                result[0] = map.get(comp);
                result[1] = i;
            }else {
                map.put(nums[i], i);
            }
        } return result;
    }
}
