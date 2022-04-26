package com.hugqq;

/**
 * 有效的括号
 * @see <a href="https://leetcode-cn.com/problems/valid-parentheses/"></a>
 */
public class _20 {

    public static void main(String[] args) {
        System.out.println(isValid("[({(())}[()])]"));
    }

    public static boolean isValid(String s) {
        while (s.contains("{}") || s.contains("[]") || s.contains("()")) {
            if (s.contains("{}")) {
                s = s.replace("{}", "");
            }
            if (s.contains("()")) {
                s = s.replace("()", "");
            }
            if (s.contains("[]")) {
                s = s.replace("[]", "");
            }
        }
        return s.isEmpty();
    }
}
