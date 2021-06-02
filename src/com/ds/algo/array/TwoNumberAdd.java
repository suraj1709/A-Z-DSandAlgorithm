package com.ds.algo.array;

public class TwoNumberAdd {
    /*
     * Question Number 4:
     * Problem Statement :
     * Remove Two Number add upto value in a sorted array
     * Example :
     * Input : [1,2,3,4,5] value= 8
     * Output : true
     * */


    /*
     *
     * Time Complexity :O(n)
     * Space Complexity : O(n)
     *
     * */

    public static boolean addTwoNumber(int[] nums,int value)
    {
        int i=0,j=nums.length-1;
        while(i<j)
        {
            int sum=nums[i]+nums[j];
            if(sum==value)
            {
                return true;
            }
            else if(sum>value)
            {
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean response=TwoNumberAdd.addTwoNumber(new int[]{1,2,3,4,5},10);
        System.out.print(response);
    }
}
