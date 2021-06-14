package com.ds.algo.dp;

public class KnapSack {

    /*
     * Exponential Time Complexity that is O(2^N)
     * Space Complexity is Call Stack that is length of String s1 and s2;
     * */
    public static int ks(int[] v,int[] w,int W,int n)
    {

        if(W<0)
        {
            return -1;
        }
        if(n<0||W==0)
        {
            return 0;
        }
        int include=v[n]+ks(v,w,W-w[n],n-1);
        int exclude=ks(v,w,W,n-1);
        return Math.max(include,exclude);
    }

    /*
     * Moving to DP problem
     * Time Complexity -->O(N*W)
     * Space Complexity-->O(N*W)
     * */
    public static int knapsackDP(int[] v,int[] w,int W)
    {
        int[][] dp=new int[v.length+1][W+1];
        for(int i=1;i<=v.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(j-w[i-1]>=0)
                {
                    dp[i][j]=Math.max(v[i-1]+dp[i-1][j-w[i-1]],dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[v.length][W];
    }

    public static void main(String[] args) {
        int res=KnapSack.ks(new int[] {2,8,7,6},new int[]{2,8,6,4},10,3);
        System.out.println(" Recursive Approach : Coins change can be in : "+res+" ways");
        int result=KnapSack.knapsackDP(new int[]{8,7,5,12},new int[]{2,8,6,4},10);
        System.out.println("The Max value is : " +result);
    }

}
