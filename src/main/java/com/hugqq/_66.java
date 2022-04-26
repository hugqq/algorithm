package com.hugqq;

import java.util.Arrays;

/**
 * 加一
 *
 * @see <a href="https://leetcode-cn.com/problems/plus-one/"></a>
 */
public class _66 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,8,9})));
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}
