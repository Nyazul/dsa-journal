// 0049. Group Anagrams - Arrays & Hashing - Medium - 2026-11-19
// Insight: Use a HashMap to group strings by their sorted character representation. The sorted string serves as a unique key for anagrams.
// Time O(n * k log k)
// Space O(n * k)
// Mistake I made: I initially tried to use the original strings as keys, which would not group anagrams correctly. Sorting the characters of each string provides a consistent key for all anagrams.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagrams_0049 {

    public static void main(String[] args) {
        Solution_0049 solution = new Solution_0049();
        // Add more test cases to validate the solution
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat", "listen", "silent", "enlist"};
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
    }
}

class Solution_0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> ans = new HashMap<>();

        for (String string : strs) {

            // Sort the characters of the string to create a key for the hashmap
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            ans.putIfAbsent(sorted, new ArrayList<>());
            ans.get(sorted).add(string);
        }

        return new ArrayList<>(ans.values());
    }
}