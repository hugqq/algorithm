package com.hugqq;

/**
 * 移除元素
 * @see <a href="https://leetcode-cn.com/problems/remove-element/"></a>
 */
public class _27 {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{  1,2,2,3, 4},2));

    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

}
