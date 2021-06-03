package com.ds.algo.array;

public class ReArrangeArray {

    /*
     * Question Number 6:
     * Problem Statement :
     * Re-Arrange +ve and -ve number
     * Example :
     * Input : [12, 11, -13, -5, 6, -7, 5, -3, -6]
     * Output : [-13, -5, -7, -3, -6, 12, 11, 6, 5]
     * */


    /*
     *
     * Time Complexity :O(n)
     * Space Complexity : O(n)
     *
     * */

    public static int[] reArrangeArray(int[] nums)
    {
        int[] response= new int[nums.length];
        int i=0;
        int j=0;
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]<0)
            {
                j++;
            }
        }



        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]>=0){
                response[j]=nums[k];
                j++;
            }
            else {
                response[i]=nums[k];
                i++;
            }
        }
        return response;
    }

    public static void main(String[] args) {

        int[] response=ReArrangeArray.reArrangeArray(new int[]{12, 11, -13, -5, 6, -7, 5, -3, -6});
        for (int ans: response)
        {
            System.out.print(ans+ "  ");

        }
    }
}
