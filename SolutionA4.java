public import java.util.HashMap;

public class SolutionA4 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); //[cite: 1]
        // Base case: prefix sum of 0 appears once before array starts
        map.put(0, 1); //[cite: 1]

        int currentSum = 0; //[cite: 1]
        int count = 0; //[cite: 1]

        for (int num : nums) {
            currentSum += num; //[cite: 1]

            // If (currentSum - k) exists in map, add its frequency
            if (map.containsKey(currentSum - k)) { //[cite: 1]
                count += map.get(currentSum - k); //[cite: 1]
            }

            // Store/update current prefix sum frequency
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1); //[cite: 1]
        }

        return count; //[cite: 1]
    }
} {
    
}
