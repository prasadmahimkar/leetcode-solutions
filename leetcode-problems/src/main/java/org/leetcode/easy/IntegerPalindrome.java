package org.leetcode.easy;
/*
Problem Statement
Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/

public class IntegerPalindrome {

    public static boolean isNumberPalindrome(int number) {
        boolean isNumberPalindrome = false;
        int remainder;
        int reversedNum = 0;
        int inputNumber = number;
        if(number > 0){
            while (inputNumber != 0){
                remainder = inputNumber%10;
                reversedNum = reversedNum*10+remainder;
                inputNumber = inputNumber/10;
            }
        }
        if(reversedNum == number){
            isNumberPalindrome = true;
        }
        return isNumberPalindrome;
    }
}
