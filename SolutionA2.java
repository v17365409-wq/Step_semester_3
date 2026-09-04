 public class SolutionA2 {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0]; //[cite: 1]
        int currentMax = nums[0]; //[cite: 1]

        for (int i = 1; i < nums.length; i++) { //[cite: 1]
            // Decide whether to extend the existing subarray or start a new one
            currentMax = Math.max(nums[i], currentMax + nums[i]); //[cite: 1]
            maxSoFar = Math.max(maxSoFar, currentMax); //[cite: 1]
        }

        return maxSoFar; //[cite: 1]
    }
} {
    
}
