package com.ds.algo.dp;

public class SubsetSum {


    public static boolean isSubsetSum(int[] arr,int sum,int n)
    {

        if(sum==0)
        {
            return true;
        }
        if( n==0)
        {
            return false;
        }

            boolean include=isSubsetSum(arr,sum-arr[n],n-1);
            boolean exclude=isSubsetSum(arr,sum,n-1);
            return exclude || include;

    }

    public static void main(String[] args) {
        boolean segregate=SubsetSum.isSubsetSum(new int[]{6,8,4,9},20,3);
        System.out.println("We can subset the arr : "+segregate);
    }
}
