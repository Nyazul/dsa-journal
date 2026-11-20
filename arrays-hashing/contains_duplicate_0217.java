// 0217 Contains Duplicate · Arrays & Hashing · Easy · 2026-11-16
// Insight: Use a HashSet to track seen elements and return true as soon as a duplicate is found.
// Time O(n), Space O(n). Mistake I made: none


import java.util.HashSet;

public class contains_duplicate_0217 {

    public static void main(String[] args) {
        Solution_0217 solution = new Solution_0217();
        int[] nums = {1, 2, 3, 4, 5, 7};
        boolean result = solution.containsDuplicate(nums);
        System.out.println(result); // Output: true
    }
    
}

class Solution_0217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> present = new HashSet<>();

        for (int i : nums) {
            if (!present.add(i)) {
                return true;
            }
        }
        return false;
    }
}