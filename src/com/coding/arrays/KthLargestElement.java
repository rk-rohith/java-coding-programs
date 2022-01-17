package com.coding.arrays;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args){
        int nums[] = {2, 4, 5, 6, 7, 8, 9};
        int k = 2;
        final int kthLargestElement = findKthLargestElement(nums, k);
        System.out.println(k + "th largest element is "+ kthLargestElement);
    }

    private static int findKthLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int element :nums){
            queue.add(element);
            if(queue.size()>k){
                queue.poll();
            }
        } return queue.poll();
    }
}
