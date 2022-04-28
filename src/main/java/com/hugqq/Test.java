package com.hugqq;

import cn.hutool.core.lang.Dict;
import com.google.common.collect.Lists;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        String str1 = "a1";
        String str2 = "a2";
        String str3 = "a3";
        String str4 = "a4";
        String str5 = "a10";
        String str6 = "a100";
        String str7 = "b1";
        String str8 = "b2";
        String str9 = "c";
        String str10 = "d2";
        String str11 = "d10";
        List<String> list = Lists.newArrayList();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);
        list.add(str6);
        list.add(str7);
        list.add(str8);
        list.add(str9);
        list.add(str10);
        list.add(str11);
        Collections.shuffle(list);
        list.forEach(System.out::println);
        System.out.println("===========================================");
        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("===========================================");

        int maxLength = String.valueOf(list.stream().mapToInt(e -> {
            e = e.replaceAll("((?!\\d+).)", "");
            if (e.isEmpty()) {
                return 0;
            } else {
                return Integer.parseInt(e);
            }
        }).max().getAsInt()).length();
        List<String> collect1 = list.stream().map(e -> {
            String name = e;
            String num = name.replaceAll("((?!\\d+).)", "");
            StringBuilder pre = new StringBuilder();
            for (int i = 0; i < maxLength - num.length(); i++) {
                pre.append("0");
            }
            name = e.replaceAll("(\\d+)", pre + "$1");
            return name;
        }).sorted().map(e -> {
            return e.replaceAll("([0]+)(\\d+)", "$2");
        }).collect(Collectors.toList());
        collect1.forEach(System.out::println);
    }
}
