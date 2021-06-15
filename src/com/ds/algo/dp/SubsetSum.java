package com.ds.algo.dp;

public class SubsetSum {


    public static boolean isSubsetSum(int[] arr,int sum,int n)
    {

        if(sum==0)
        {
            return true;
        }
        if( n<0 || sum <0)
        {
            return false;
        }

            boolean include=isSubsetSum(arr,sum-arr[n],n-1);
            boolean exclude=isSubsetSum(arr,sum,n-1);
            return exclude || include;

    }


    public static boolean subSetSumDP(int[] arr,int sum)
    {
        boolean[][] dp=new boolean[arr.length+1][sum+1];
        for(int i=0;i<=arr.length;i++)
        {
            dp[i][0]=true;
        }
        for(int i=1;i<=arr.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(j-arr[i-1]>=0)
                {
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[arr.length][sum];
    }
    public static void main(String[] args) {
        boolean segregate=SubsetSum.isSubsetSum(new int[]{6,8,4,9},10,3);
        System.out.println("RECURSIVE SOLUTION :We can subset the arr : "+segregate);
        boolean result=SubsetSum.subSetSumDP(new int[]{6,8,4,9},10);
        System.out.println("DP SOLUTION : We can subset the arr : "+result);

    }
}
