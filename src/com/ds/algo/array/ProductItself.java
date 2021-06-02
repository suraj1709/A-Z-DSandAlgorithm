package com.ds.algo.array;

public class ProductItself {


    /*
     * Question Number 4:
     * Problem Statement :
     * Product of all except itself
     * Example :
     * Input : [1,2,3,4,5]
     * Output : [120,60,40,30,24]
     * */


    /*
     *
     * Time Complexity :O(n)
     * Space Complexity : O(n)
     *
     * */
    public static int[] productItself(int[] nums)
    {
        int[] result= new int[nums.length];
        int m=1;
        result[0]=1;
        int i=1;
        for(int j=0;j<nums.length-1;j++)
        {
            result[i]=nums[j]*result[i-1];
            i++;
        }
        for(int j=nums.length-1;j>=0;j--)
        {
            result[j]=m*result[j];
            m=m*nums[j];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] response= ProductItself.productItself(new int[]{1,2,3,4,5});
        for (int ans: response)
        {
            System.out.print(ans+ "  ");

        }
    }
}
