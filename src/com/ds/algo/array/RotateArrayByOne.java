package com.ds.algo.array;

public class RotateArrayByOne {

    /*
     * Question Number 7:
     * Problem Statement :
     * Rotate Array By One Index
     * Example :
     * Input : [1,2,3,4,5]
     * Output : [5,1,2,3,4]
     * */


    /*
     *
     * Time Complexity :O(n)
     * Space Complexity : O(1)
     *
     * */

    public static int[] rotateArray(int[] nums)
    {
        int len=nums.length;
        if(len==0)
        {
            return null;
        }
        int m=nums[len-1];
        for(int j=len-1;j>0;j--)
        {
            nums[j] =nums[j-1];
        }
        nums[0]=m;
        return nums;
    }

    public static void main(String[] args) {
        int[] response=RotateArrayByOne.rotateArray(new int[]{1,2,3,4,5});
        for (int ans: response)
        {
            System.out.print(ans+ "  ");

        }
    }

}
