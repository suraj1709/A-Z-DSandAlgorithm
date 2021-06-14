package com.ds.algo.dp;
//No duplicate coins are allowed.
public class CoinChangeI {

    /*
     * Exponential Time Complexity that is O(2^N)
     * Space Complexity is Call Stack that is length of String s1 and s2;
     * */

    public static int coinChange(int[] coin,int N,int n)
    {
        if(N==0)
        {
            return 1;
        }
        if(n<0 || N<0)
        {
            return 0;
        }

        int include=coinChange(coin,N-coin[n],n-1);
        int exclude=coinChange(coin,N,n-1);
        return include+exclude;

    }

    /*
     * Moving to DP problem
     * Time Complexity -->O(CoinArrayLength*N)
     * Space Complexity-->O(CoinArrayLength*N)
     * */
    public static int coinChangeDP(int[] coin,int N)
    {
        int[][] dp= new int[coin.length+1][N+1];
        for(int i=0;i<=coin.length;i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<=coin.length;i++)
        {
            for (int j=1;j<=N;j++)
            {
                if(j-coin[i-1]>=0)
                {
                    dp[i][j]=dp[i-1][j-coin[i-1]]+dp[i-1][j];
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[coin.length][N];
    }
    public static void main(String[] args) {
        int res=CoinChangeI.coinChange(new int[] {2,8,7,6},10,3);
        System.out.println(" Recursive Approach : Coins change can be in : "+res+" ways");
        int result=CoinChangeI.coinChangeDP(new int[] {2,8,7,6},10);
        System.out.println("DP Approach : Coins change can be in : "+result+" ways");
    }
}
