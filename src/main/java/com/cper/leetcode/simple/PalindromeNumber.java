package com.cper.leetcode.simple;

import java.util.Scanner;

/**
 * @author a-cper-cpu
 * @date 2022-02-12-21:45
 */
public class PalindromeNumber {
    /**
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
     *
     * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：x = 121
     * 输出：true
     * 示例 2：
     *
     * 输入：x = -121
     * 输出：false
     * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
     * 示例 3：
     *
     * 输入：x = 10
     * 输出：false
     * 解释：从右向左读, 为 01 。因此它不是一个回文数。
     * 示例 4：
     *
     * 输入：x = -101
     * 输出：false
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/palindrome-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        //定义输入流
        Scanner sc = new Scanner(System.in);
        //输入整数
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }

    public static boolean isPalindrome(int x) {
        String snum = String.valueOf(x);
        StringBuffer sBF = new StringBuffer();

        for (int i = snum.length()-1; i > -1; i--) {
            char cnum = snum.charAt(i);
            sBF.append(cnum);
        }
        String str = sBF.toString();
        //这样如果是-121就会报错，因为121-不是整数
//        int iafter = Integer.parseInt(str);

        if(snum.equals(str)){
            return true;
        }else{
            return false;
        }
    }
}
