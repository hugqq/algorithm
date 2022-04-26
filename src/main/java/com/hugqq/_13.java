package com.hugqq;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * 罗马数字转整数
 * @see <a href="https://leetcode-cn.com/problems/roman-to-integer/"></a>
 */
public class _13 {

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>(7);
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        Map<String, Integer> specialMap = new HashMap<>(5);
        specialMap.put("IV", 4);
        specialMap.put("IX", 9);
        specialMap.put("XL", 40);
        specialMap.put("XC", 90);
        specialMap.put("CD", 400);
        specialMap.put("CM", 900);
        int i = 0;
        String symbol = ":";
        for (String key : specialMap.keySet()) {
            if (s.contains(key)) {
                s = s.replaceAll(key, specialMap.get(key).toString() + symbol);
            }
        }
        for (String key : map.keySet()) {
            if (s.contains(key)) {
                s = s.replaceAll(key, map.get(key).toString() + symbol);
            }
        }
        for (String s2 : s.split(symbol)) {
            i += Integer.parseInt(s2);
        }
        return i;
    }

}
