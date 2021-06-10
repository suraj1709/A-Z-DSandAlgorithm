package com.ds.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxChunkToMakeSorted {

    //Brute force Solution
    public static int getMaxChunk(int[] nums)
    {
        int count=0;
        int[] temp=Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);
        for(int i=0;i<nums.length;i++)
        {
           int[] arr1=Arrays.copyOfRange(nums,0,i);
           Arrays.sort(arr1);
           int[] arr2=Arrays.copyOfRange(nums,i,nums.length);
           Arrays.sort(arr2);
           if(Arrays.equals(concat(arr1,arr2),temp))
           {
               count++;
           }
        }
        return count;
    }

    private static int[] concat(int[] arr1, int[] arr2) {

        int[] result= new int[arr1.length+arr2.length];
        int i=0;
        for(int j=0;j<arr1.length;j++){
            result[i]=arr1[j];
            i++;
        }

        for(int j=0;j<arr2.length;j++){
            result[i]=arr2[j];
            i++;
        }
        return  result;
    }

    //Optimal Solution

    public static int getMaxChunk1(int[] nums)
    {
        int[] max=new int[nums.length];
        int val=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max[i]=Math.max(nums[i],val);
            val=max[i];

        }
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]==max[i])
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        int result=MaxChunkToMakeSorted.getMaxChunk(new int[]{1,0,2,3,4});
        int result1=MaxChunkToMakeSorted.getMaxChunk1(new int[]{1,0,2,3,4});
        System.out.println("Max chunk is "+result);
        System.out.println("Max chunk is "+result1);

    }
}
