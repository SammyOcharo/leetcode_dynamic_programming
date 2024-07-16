package com.samdev.dynammic_programming;

public class LongestPalindromicSubstring {

    //Longest Palindromic Substring
    //Medium
    //Topics
    //Companies
    //Hint
    //Given a string s, return the longest
    //palindromic
    //
    //substring
    // in s.
    //Example 1:
    //Input: s = "babad"
    //Output: "bab"
    //Explanation: "aba" is also a valid answer.
    //Example 2:
    //
    //Input: s = "cbbd"
    //Output: "bb"

    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";

        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLength = 1;

        //if substring of length 1 then all are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        //check for substrings of length 2
        for( int i=0; i<n-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                start = i;
                maxLength=2;
            }
        }

        //check for substrings of length 3 or more
        for(int length=3; length<=n; length++){
            for(int i=0; i<n-length; i++){
                int j = i+length-1;

                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;

                    if(length>maxLength){
                        start = i;
                        maxLength = length;
                    }
                }
            }
        }

        return s.substring(start, start+maxLength);
    }

}
