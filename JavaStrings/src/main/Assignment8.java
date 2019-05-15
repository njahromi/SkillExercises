package main;

/*
 * Write a class named Assignment8that checks if two strings are anagrams. Recall that an anagram is
a word that can be formed by rearranging the letters of another. For example, angel is an anagram of
angle and glean. (Hint: You will have to use the string methods that you are familiar with along with one
or more loops)
 */

import java.util.Arrays;  

public class Assignment8 {  
    static void isAnagram(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {  
        isAnagram("angel", "angle");  
        isAnagram("glean", "angel");  
    }  
}  
