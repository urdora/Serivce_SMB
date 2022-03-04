package com.urdora.demo;

import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void test() {
        int[] nums = {2, 7, 11, 15};
        twoSum(nums, 9);
    }

    public int[] twoSum(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = 0;
        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        startIndex = i;
                        endIndex = j;
                    }
                }
            }
        }
        return new int[]{startIndex, endIndex};
    }
}
