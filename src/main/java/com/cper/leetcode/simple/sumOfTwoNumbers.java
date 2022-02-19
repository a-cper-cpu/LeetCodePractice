package com.cper.leetcode.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author a-cper-cpu
 * @date 2022-02-12-20:23
 */
public class sumOfTwoNumbers {
    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     *
     * 你可以按任意顺序返回答案。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 示例 1：
     *
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     * 示例 2：
     *
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     * 示例 3：
     *
     * 输入：nums = [3,3], target = 6
     * 输出：[0,1]
     *  
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        //创建输入流
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        //输入数组,以#结束  sc.hasNext("#")它会先判断你是否符合#号，不符合就不执行里面的方法，符合就进去，他不接收这个输入，他就判断是否符合
        //Scanner输入如何判断输入回车
        while(sc.hasNext()){
            String  num = sc.next();
            if (!num.equals("#")) {
                list.add(Integer.valueOf(num));
            }else{
                break;
            }
        }
        //list转数组
        /**
         * 使用Stream
         * List list = new ArrayList<>();
         * int[] arr = list.stream().mapToInt(Integer::valueOf).toArray();
         * // 想要转换成int[]类型，就得先转成IntStream。
         * // 这里就通过mapToInt()把Stream<Integer>调用Integer::valueOf来转成IntStream
         * // 而IntStream中默认toArray()转成int[]。
         *
         * int[] arr = list.stream().mapToInt(Integer::valueOf).toArray();
         */
        int[] nums= list.stream().mapToInt(Integer::valueOf).toArray();
        //输入target 和
        int target = sc.nextInt();
        int[] ints = twoSum(nums, target);

        System.out.println(Arrays.toString(ints));
    }

    //找符合和的两个值的数组索引
    public static int[] twoSum(int[] nums, int target) {
        //定义变量
        int before = 0;
        int after = 0;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        //循环数组
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                before = nums[i];
                after = nums[j];
                sum = before + after;
                //找到满足和
                if(sum == target){
                    list.add(i);
                    list.add(j);
                    return list.stream().mapToInt(Integer::valueOf).toArray();
                }
            }
        }
        return null;
    }


}
