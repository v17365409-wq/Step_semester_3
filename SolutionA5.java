public public class SolutionA5 {
    public int findMin(int[] nums) {
        int left = 0; //[cite: 1]
        int right = nums.length - 1; //[cite: 1]

        while (left < right) { //[cite: 1]
            int mid = left + (right - left) / 2; //[cite: 1]

            // Compare middle element with rightmost element
            if (nums[mid] > nums[right]) { //[cite: 1]
                // Minimum must be in the right half
                left = mid + 1; //[cite: 1]
            } else {
                // Minimum is mid or in the left half
                right = mid; //[cite: 1]
            }
        }

        return nums[left]; //[cite: 1]
    }
} {
    
}
