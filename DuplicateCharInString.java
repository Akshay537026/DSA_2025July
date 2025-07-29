// print all the duplicate characters in a string :-
// here we are printing list which contains dulicate charaters and their occurrence.
// GFG doesnt have as practice for this one

// Input: s = "geeksforgeeks"
// Output: ['e', 4], ['g', 2], ['k', 2], ['s', 2]
// Explanation: Characters e, g, k, and s appear more than once. Their counts are shown in order of first occurrence.

// Input: s = "programming"
// Output: ['r', 2], ['g', 2], ['m', 2]
// Explanation: Only r, g, and m are duplicates. Output lists them with their counts.

// Input: s = "mississippi"
// Output: ['i', 4], ['s', 4], ['p', 2]
// Explanation: Characters i, s, and p have multiple occurrences. The output reflects that with count and order preserved.

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class DuplicateCharInString {
    public static void main(String[] args) {
        DuplicateCharInString d = new DuplicateCharInString();
        System.out.println(d.duplicateChar("geeksforgeeks"));// Output: ['e', 4], ['g', 2], ['k', 2], ['s', 2]
    }

    public List<Map<Character, Integer>> duplicateChar(String s) {
        List<Map<Character, Integer>> res = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char k = entry.getKey();
            int v = entry.getValue();

            if (v > 1) {
                Map<Character, Integer> temp = new HashMap<>();
                temp.put(k, v);

                res.add(temp);
            }
        }

        // for(int i=0; i<res.size(); i++) {

        // }

        return res;
    }
}
