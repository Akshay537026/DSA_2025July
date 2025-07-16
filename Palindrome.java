// https://leetcode.com/problems/valid-palindrome/
class Palindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // s.replaceAll("[^a-zA-Z0-9]","") --> it removes all non alphanumeric rather
        // using s.replaceAll("[\\s!@#$%^&*()\\-+=\\[\\]{}:;'\"<>,.?/~_]", "")

        // '^' negated character class - Match any character that is NOT a letter (a-z
        // or A-Z) or digit (0-9) - if not used change complete patter - it deletes
        // alphabet and numbers

        StringBuilder sb = new StringBuilder(s);

        // String temp=sb.reverse().toString();

        if (s.equals(sb.reverse().toString()))
            return true;
        else
            return false;

    }
}