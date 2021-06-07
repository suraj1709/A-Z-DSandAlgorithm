package com.ds.algo.array;

public class SearchRotatedArray {

    /*
    *Question Number 12:
     * Problem Statement :
     * Find value in sorted in an array
     * Example :
    *   Input :[4,5,6,1,2,3]
    *    value=2
    *   Output :true
    * */

    /*
     *
     * Time Complexity :O(nlog(n))
     * Space Complexity : O(1)
     *
     * */
    public static boolean searchArray(int[] nums,int value)
    {
        int first=0;
        int end=nums.length-1;
        int mid;
        while(first<=end)
        {
            mid=first+(end-first)/2;
            if(nums[mid]==value)
            {
                return true;
            }
            else if(nums[first]<=value && value<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                first=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result=SearchRotatedArray.searchArray(new int[]{4,5,6,1,2,3},1);
        String value=result==true?"yes":"no";
        System.out.println("Is it there : " +value);
    }


}
