package com.hugqq;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @Description 二进制求和
 * @see <a href="https://leetcode-cn.com/problems/add-binary/"></a>
 */
public class _67 {

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    // java leetcode禁止
//    public static String addBinary(String a, String b) {
//        BigInteger b1 = new BigInteger(a, 2);
//        BigInteger b2 = new BigInteger(b, 2);
//        return b1.add(b2).toString(2);
//    }
    public static String addBinary(String a, String b) {
        if (a == null || a.length() == 0) {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }
        StringBuilder stb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        // 进位
        int c = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                c += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                c += b.charAt(j--) - '0';
            }
            stb.append(c % 2);
            c >>= 1;
        }
        String res = stb.reverse().toString();
        return c > 0 ? '1' + res : res;
    }
}
