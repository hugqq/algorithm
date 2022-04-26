package com.hugqq;

/**
 * 最后一个单词的长度
 *
 * @see <a href="https://leetcode-cn.com/problems//length-of-last-word/"></a>
 */
public class _58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        if (s.length()==0) return 0;
        String[] res = s.split(" ");
        return res[res.length-1].length();
    }

}
