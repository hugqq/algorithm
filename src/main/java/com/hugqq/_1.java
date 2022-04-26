package com.hugqq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * 字典法
 * @see <a href="https://leetcode-cn.com/problems/two-sum/"></a>
 */
public class _1  {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 11, 7, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        // value index
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                // 放置第一个元素
                map.put(nums[0], 0);
            } else {
                // 寻找目标值是否在map中
                int q = target - nums[i];
                // 存在即返回
                if (map.containsKey(q)) {
                    res[0] = map.get(q);
                    res[1] = i;
                    return res;
                }
                map.put(nums[i], i);
            }
        }
        return res;
    }
}
