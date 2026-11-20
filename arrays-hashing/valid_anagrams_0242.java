// 0242. Valid Anagram - Arrays & Hashing - Easy - 2026-11-16
// Insight: Use a HashMap to count the frequency of characters in the first string and then decrement the counts based on the second string. If any count goes below zero or if there are leftover counts, the strings are not anagrams.
// Time O(n), Space O(n). Mistake I made: I initially forgot to check for leftover counts in the HashMap after processing both strings, which could lead to incorrect results if the strings have different lengths or character distributions.

import java.util.HashMap;

public class valid_anagrams_0242 {
    public static void main(String[] args) {
        Solution_0242 solution = new Solution_0242();
        String s = "anagram";
        String t = "nagaram";
        boolean result = solution.isAnagram(s, t);
        System.out.println(result); // Output: true
    }
}

class Solution_0242 {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> anagram = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (!anagram.containsKey(c))
                anagram.put(c, 1);
            else
                anagram.put(c, anagram.get(c) + 1);
        }

        for (Character c : t.toCharArray()) {
            if (!anagram.containsKey(c))
                return false;
            else {
                anagram.put(c, anagram.get(c) - 1);
                if (anagram.get(c) < 0) {
                    return false;
                }
            }
        }

        // Check remaining elements as well
        for (Integer value : anagram.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    
}
