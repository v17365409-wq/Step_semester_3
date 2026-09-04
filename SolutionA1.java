import java.util.Arrays;

public class SolutionA1 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Forward pass: calculate prefix products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Backward pass: calculate suffix products and combine
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        SolutionA1 solution = new SolutionA1();
        
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        
        System.out.println(Arrays.toString(result));
    }
}