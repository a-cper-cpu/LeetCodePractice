package com.cper.leetcode.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author a-cper-cpu
 * @date 2022-02-20-20:35
 */
public class ThirdMax {
    /*
     * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
     *
     *
     *
     * 示例 1：
     *
     * 输入：[3, 2, 1]
     * 输出：1
     * 解释：第三大的数是 1 。
     * 示例 2：
     *
     * 输入：[1, 2]
     * 输出：2
     * 解释：第三大的数不存在, 所以返回最大的数 2 。
     * 示例 3：
     *
     * 输入：[2, 2, 3, 1]
     * 输出：1
     * 解释：注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
     * 此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/third-maximum-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        //创建输入流
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        //输入数组,以#结束  sc.hasNext("#")它会先判断你是否符合#号，不符合就不执行里面的方法，符合就进去，他不接收这个输入，他就判断是否符合
        //Scanner输入如何判断输入回车
        while (sc.hasNext()) {
            String num = sc.next();
            if (!num.equals("#")) {
                list.add(Integer.valueOf(num));
            } else {
                break;
            }
        }
        int[] nums = list.stream().mapToInt(Integer::valueOf).toArray();
        System.out.println(thirdMax(nums));

    }

    public static int thirdMax(int[] nums) {
        //当数组只有两个数及一个数时
        if (nums.length == 2) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            if (i == 2) {
                return nums[i];
            }
        }
        return -1;
    }
}
