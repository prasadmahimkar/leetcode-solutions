package org.leetcode.easy;

import junit.framework.TestCase;

import static org.leetcode.easy.IntegerPalindrome.isNumberPalindrome;

public class IntegerPalindromeTest extends TestCase {

    public void testIsNumberPalindrome() {
        assertTrue(isNumberPalindrome(121));
        assertTrue(isNumberPalindrome(1223221));
        assertFalse(isNumberPalindrome(1002));
        assertFalse(isNumberPalindrome(-121));

    }
}