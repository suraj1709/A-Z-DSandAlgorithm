package com.ds.algo.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextMinimumElement {
    public static int[] getNextMinimum(int[] nums)
    {
        int[] result= new int[nums.length];
        Stack<Integer> stack= new Stack<>();
        Arrays.fill(result,-1);

        for(int i=nums.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek()>=nums[i]) {

                stack.pop();

            }
            if(!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] result=NextMinimumElement.getNextMinimum(new int[]{ 2, 7, 3, 5, 4, 6, 8 });
        for(int val:result)
        {
            System.out.print(val+" ");
        }
    }
}
