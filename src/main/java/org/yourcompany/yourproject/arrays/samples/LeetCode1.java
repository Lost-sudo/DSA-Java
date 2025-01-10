package org.yourcompany.yourproject.arrays.samples;

import java.util.Arrays;

public class LeetCode1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = twoSum(nums, 9);
        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; i < nums.length; i++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found.");
    }
}
