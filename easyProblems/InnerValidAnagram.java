package easyProblems;

import java.util.Arrays;
/*
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 *typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

*/
public class InnerValidAnagram {

    public class ValidAnagram {
        public boolean isAnagram(String s, String t) {
        
            char [] sChars = s.toCharArray();
            char [] tChars = t.toCharArray();
    
            Arrays.sort(sChars);
            Arrays.sort(tChars);
            
            return Arrays.equals(sChars, tChars);
        }
    }
}
