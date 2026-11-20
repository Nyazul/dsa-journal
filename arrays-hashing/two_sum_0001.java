// 0001. Two Sum - Arrays & Hashing - Easy - 2026-11-19
// Insight: Use a HashMap to store the value and its index. For each element, check if the complement (target - current value) exists in the HashMap. If it does, return the indices.
// Time O(n), Space O(n). Mistake I made: I forgot to check if the complement is not the same index as the current element, which could lead to using the same element twice.

import java.util.HashMap;

public class two_sum_0001 {
    public static void main(String[] args) {
        Solution_001 solution = new Solution_001();
        // Add more test cases to validate the solution
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

}


class Solution_001 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            index.put(nums[i], i);
        }

        System.out.println(index);


        for (int i = 0; i < nums.length; i++) {
            
            if (index.get(target - nums[i]) != null && index.get(target - nums[i]) != i) {
                return new int[] {index.get(target - nums[i]), i};
            }
        }

        

        return new int[] {0,0};
    }
}