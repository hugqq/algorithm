package com.hugqq;

import java.util.HashMap;

/**
 * 最长公共前缀
 * @see <a href="https://leetcode-cn.com/problems/longest-common-prefix/"></a>
 */
public class _14 {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        for (String string : strs) {
            while (!string.startsWith(s)) {
                if (string.length() == 0) {
                    return "";
                }
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }

}
