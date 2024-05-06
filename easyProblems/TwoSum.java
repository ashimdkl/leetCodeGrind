package easyProblems;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        int x = nums.length;

        for (int i = 0; i < x - 1; i++) {
            for (int j = i + 1; j < x; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int [] {i,j};
                }
            }
        }
        
        return new int [] {};
    }
}
