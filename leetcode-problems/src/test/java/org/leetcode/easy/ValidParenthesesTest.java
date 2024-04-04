package org.leetcode.easy;

import junit.framework.TestCase;

import static org.leetcode.easy.ValidParentheses.isValidParentheses;

public class ValidParenthesesTest extends TestCase {

    public void testIsValidParentheses() {
        assertTrue(isValidParentheses("({})"));
        assertTrue(isValidParentheses("(){}[]"));
        assertFalse(isValidParentheses("({))"));
        assertFalse(isValidParentheses("(]"));
        assertTrue(isValidParentheses("{[]}"));
        assertFalse(isValidParentheses("(("));
        assertFalse(isValidParentheses("))"));

    }
}