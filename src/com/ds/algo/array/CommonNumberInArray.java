package com.ds.algo.array;

import java.util.ArrayList;
import java.util.List;

public class CommonNumberInArray {

    /*
     * Question Number 14:
     * Problem Statement :
     * Find common List in an Array of 3
     * Example :
     * Input : {1, 5, 10, 20, 40, 80},{6, 7, 20, 80, 100},{3, 4, 15, 20, 30, 70, 80, 120}
     * Output : {20,80}
     * */


    /*
     *
     * Time Complexity :O(n)
     * Space Complexity : O(n)
     *
     * */

    public static List<Integer> getCommonInArray(int[] nums1,int[] nums2,int[] nums3)
    {
        int i=0;
        int j=0;
        int k=0;
        List<Integer> response= new ArrayList<>();
        while(i<nums1.length && j<nums2.length && k<nums3.length)
        {
            boolean isEqual=checkEqual(nums1,nums2,nums3,i,j,k);
            if(isEqual)
            {
                response.add(nums1[i]);
                i++;
                j++;
                k++;
            }
            else if(nums1[i]>nums2[j] && nums2[j]<nums3[k])
            {
                j++;
            }
            else if(nums1[i]<nums3[k])
            {
                i++;
            }
            else
            {
                k++;
            }
        }
        return response;

    }


    /*
    *
    * Time Complexity : O(1)
    * Space Complexity : O(1)
    * */

    private static boolean checkEqual(int[] nums1, int[] nums2, int[] nums3, int i, int j, int k) {

        if(nums1[i]==nums2[j] && nums2[j]==nums3[k])
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> result=CommonNumberInArray.getCommonInArray(new int[]{1, 5, 10, 20, 40, 80} ,new int[]{6, 7, 20, 80, 100} ,new int[] {3, 4, 15, 20, 30, 70, 80, 120} );

        for(Integer nums: result)
        {
            System.out.println(nums + "  ");
        }
    }
}
