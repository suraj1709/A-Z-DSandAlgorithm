package com.ds.algo.array;

public class PeakElement {


    /*
     *
     * Time Complexity :O(n)
     * Space Complexity : O(1)
     *
     * */
    public static int findPeakElement1(int[] nums)
    {
        if(nums.length==1)
        {
            return 0;
        }
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1])
            {
                return i;
            }
        }
        if(nums[0]>nums[nums.length-1])
        {
            return 0;
        }
        return nums.length-1;
    }



    /*
     *
     * Time Complexity :O(log n)
     * Space Complexity : O(1)
     *
     * */
    public static int findPeakElement2(int[] nums)
    {
        int first=0;
        int end=nums.length-1;
        int mid;
        while(first<end)
        {
            mid=first+(end-first)/2;

            if(nums[mid]<nums[mid+1])
            {
                first=mid+1;
            }
            else
            {
                end=mid;
            }

        }
        return first;
    }
}
