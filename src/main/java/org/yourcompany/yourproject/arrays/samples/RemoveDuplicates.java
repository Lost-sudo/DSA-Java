package org.yourcompany.yourproject.arrays.samples;


public class RemoveDuplicates {

    public static int removeDuplicatesInSortedArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = i; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[j] = nums[i];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};
        int result = removeDuplicatesInSortedArray(nums);
        System.out.println(result);
    }

}
