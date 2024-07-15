package com.samdev.dynammic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @Test
    void longestPalindrome() {
        String s1 = "babad";

        String s2 = "cbbd";

        assertEquals("bab", LongestPalindromicSubstring.longestPalindrome(s1));
        assertEquals("bb", LongestPalindromicSubstring.longestPalindrome(s2));
        assertNotEquals("kk", LongestPalindromicSubstring.longestPalindrome(s1));
    }
}