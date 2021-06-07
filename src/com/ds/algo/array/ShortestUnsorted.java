package com.ds.algo.array;

import java.util.Arrays;

public class ShortestUnsorted {

    public static int findUnsortedSubArray1(int[] nums)
    {
        /*
         *
         * Time Complexity :O(n)
         * Space Complexity : O(n)
         *
         * */
        int peak=PeakElement.findPeakElement1(nums);
        System.out.println(peak);
        int lowPeak=reverseLowPeak(nums);
        System.out.println(lowPeak);
        return lowPeak-peak>0?lowPeak-peak+1:0;
    }

    public static int findUnsortedSubArray2(int[] nums)
    {
        /*
         *
         * Time Complexity :O(nlog n)
         * Space Complexity : O(n)
         *
         * */
       int[] arrCopy=nums.clone();
        Arrays.sort(arrCopy);
        int first=0;
        int end=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=arrCopy[i])
            {
                first=i;
                break;
            }
        }
        for(int i=nums.length;i>0;i--)
        {
            if(nums[i]!=arrCopy[i])
            {
                end=i;
                break;
            }
        }
        return end-first;
    }

    public static int reverseLowPeak(int[] arr)
    {
        if(arr.length==1)
        {
            return 0;
        }
        for(int i=arr.length-2;i>=1;i--)
        {
            if(arr[i]<arr[i+1] && arr[i]<arr[i-1])
            {
                return i;
            }
        }
        if(arr[0]<arr[arr.length-1])
        {
            return 0;
        }
        return arr.length-1;

    }

    public static void main(String[] args) {
        int result=ShortestUnsorted.findUnsortedSubArray1(new int[]{1,2,3,4});
        System.out.println("Result is "+result);
    }


}
