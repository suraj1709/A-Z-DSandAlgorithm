package com.ds.algo.array;

public class LastOccurrence {
    public static int lastOccurrenceInSortedArray(int [] nums,int key)
    {

        /*
         *
         * Time Complexity :O(log n)
         * Space Complexity : O(1)
         *
         * */
        int start=0;
        int end=nums.length-1;
        int mid;
        int result=-1;
        while (start<=end)
        {
            mid=start+(end-start);
            if(nums[mid]==key)
            {
                result=mid;
                start=mid+1;
            }
            else if(nums[mid]>key)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result=LastOccurrence.lastOccurrenceInSortedArray(new int[]{1,2,2,2,2,3,3,3,4},3);
        System.out.println("Last Occurrence is : " +result);
    }
}


