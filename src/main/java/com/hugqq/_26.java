package com.hugqq;
/**
 * 删除有序数组中的重复项
 * @see <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/"></a>
 */
public class _26 {
    public static void main(String[] args) {


        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        // 数组长度为索引 + 1
        return slow + 1;
    }
}
