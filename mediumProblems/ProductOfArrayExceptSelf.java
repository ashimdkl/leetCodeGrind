package mediumProblems;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; // Get the length of the input array 'nums'.
        int[] ans = new int[n]; // Initialize the array 'ans' to store the results.

        Arrays.fill(ans, 1); // Fill the 'ans' array with 1s. [1, 1, 1, ..., 1]

        int curr = 1; // Initialize 'curr' as 1. This will store the cumulative product of elements from the left.

        // Loop to calculate the products of all elements to the left of each element.
        for (int i = 0; i < n; i++) {
            ans[i] *= curr; // Multiply the current value at index 'i' by 'curr'. Initially, all are 1.
            curr *= nums[i]; // Update 'curr' to include the product of the current element.
            // After each iteration, 'ans' looks like:
            // Iteration 0: ans = [1, 1, 1, ..., 1] (no change on first iteration as curr starts as 1)
            // Iteration 1: ans = [1, nums[0], 1, ..., 1]
            // Iteration 2: ans = [1, nums[0], nums[0]*nums[1], ..., 1]
            // ...
        }

        curr = 1; // Reset 'curr' to 1 for the right product calculation.

        // Loop to calculate the products of all elements to the right of each element.
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr; // Multiply the current value at index 'i' by 'curr'.
            curr *= nums[i]; // Update 'curr' to include the product of the current element.
            // After each iteration, 'ans' looks like:
            // Iteration n-1: ans = [1, 1, ..., 1, 1] (no change on first iteration as curr starts as 1)
            // Iteration n-2: ans = [1, 1, ..., 1, nums[n-1]]
            // Iteration n-3: ans = [1, 1, ..., nums[n-2]*nums[n-1], nums[n-1]]
            // ...
        }

        return ans; // Return the 'ans' array which now contains the product of all numbers except itself at each index.
    }
}
