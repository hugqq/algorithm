package com.hugqq;

import java.util.Arrays;

/**
 * 回文数
 *
 * @see <a href="https://leetcode-cn.com/problems/palindrome-number/"></a>
 */
public class _9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(8));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x >= 0 && x <= 9) {
            return true;
        }
        return new StringBuffer(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }


}
