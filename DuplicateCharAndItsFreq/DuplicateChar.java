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


package DuplicateCharAndItsFreq;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;

public class DuplicateChar {
    public static void main(String[] args) {
        System.out.println(duplicateChar("geeksforgeeks"));
        
        System.out.println(duplicateChar("programming"));

        System.out.println(duplicateChar("mississippi"));
    }

    public static List<Pair> duplicateChar(String s) {
        List<Pair> res=new ArrayList<>();
        Map<Character, Integer> lmap=new LinkedHashMap<>();

        for(char ch:s.toCharArray()) {
            lmap.put(ch, lmap.getOrDefault(ch,0) + 1);
        }

        for(Map.Entry<Character,Integer> entry:lmap.entrySet()) {
            char key=entry.getKey();  // unboxing
            int value=entry.getValue();

            if(value>1) {
                res.add(new Pair(key,value));
            }
        }

        return res;
    }
}

class Pair {
    char c;
    int a;

    public Pair(char c, int a) {
        this.c=c;
        this.a=a;
    }

    @Override
    public String toString() {
        return "['"+c+ "', "+a+ "]";
    }
}
