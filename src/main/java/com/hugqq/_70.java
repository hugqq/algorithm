package com.hugqq;

/**
 * @Description 爬楼梯
 * @see <a href="https://leetcode-cn.com/problems/climbing-stairs/"></a>
 */
public class _70 {

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    // 备忘录
    static int[] memo;
    public static int climbStairs(int n) {
        memo = new int[n + 1];
        return dp(n);
    }


    // 定义：爬到第 n 级台阶的方法个数为 dp(n)
    static int  dp(int n) {
        // base case
        if (n <= 2) {
            return n;
        }
        if (memo[n] > 0) {
            return memo[n];
        }
        // 状态转移方程：
        // 爬到第 n 级台阶的方法个数等于爬到 n - 1 的方法个数和爬到 n - 2 的方法个数之和。
        memo[n] = dp(n - 1) + dp(n - 2);
        return memo[n];
    }
}
