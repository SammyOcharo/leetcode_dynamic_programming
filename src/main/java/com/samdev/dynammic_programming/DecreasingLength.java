package com.samdev.dynammic_programming;

import java.util.Arrays;

public class DecreasingLength {

    public static int maxNonDecreasingLength(int[] nums){
        int n = nums.length;
        if (n == 0) return 0;

        // Initialize dp array, each element is at least a subarray of length 1
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Fill dp array by checking each element and its previous elements
        for (int i = 1; i < n; i++) {
            if (nums[i] >= nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
        }

        // Find the maximum value in the dp array
        int maxLength = 1;
        for (int i = 0; i < n; i++) {
            maxLength = Math.max(maxLength, dp[i]);
        }

        // If array is not non-decreasing, the maximum non-decreasing subarray length is 1
        if (maxLength == 1) {
            return 1;
        }

        return maxLength;

    }

}
