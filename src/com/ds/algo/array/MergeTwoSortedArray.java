package com.ds.algo.array;

public class MergeTwoSortedArray {


    /*
     * Question Number 4:
     * Problem Statement :
     * Merge Two Sorted Array
     * Example :
     * Input : [1,2,3,4,5] ,[1,2,6,8]
     * Output : [1,1,2,2,3,4,5,6,8]
     * */


    /*
     *
     * Time Complexity :O(n)
     * Space Complexity : O(n)
     *
     * */


    public static int[] mergeSortedArray(int[] nums1,int[] nums2)
    {
        int len1=nums1.length;
        int len2=nums2.length;
        int[] result = new int[len1+len2];
        int i = 0,j=0,k=0;
        //Merge two array num1 and num2
        while(i<len1 && j<len2)
        {
            if(nums1[i]<=nums2[j])
            {
                result[k]=nums1[i];
                i++;
            }
            else
            {
                result[k]=nums2[j];
                j++;
            }
                k++;
        }
        while(i<len1)
        {
            result[k]=nums1[i];
            i++;
            k++;

        }
        while(j<len2)
        {
            result[k]=nums2[j];
            j++;
            k++;
        }
        return result;

    }

    public static void main(String[] args) {
        int [] response=MergeTwoSortedArray.mergeSortedArray(new int[]{1,2,3,4,5},new int[]{1,2,6,8});
        for (int ans: response)
        {
            System.out.print(ans+ "  ");

        }
    }
}
