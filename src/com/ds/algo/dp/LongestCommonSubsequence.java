package com.ds.algo.dp;

public class LongestCommonSubsequence {

    /*
    String s1="acbd"
    String s2="acb"
    O/P="acb"->3
    * */

    /*
    * Exponential Time Complexity that is O(2^N)
    * Space Complexity is Call Stack that is length of String s1 and s2;
    * */

    public static int lcsRecursion(String s1,String s2)
    {
        return getlcs(s1,s2,s1.length()-1,s2.length()-1);
    }

    private static int getlcs(String s1, String s2, int length, int length1) {

        if(length<0 || length1<0)
        {
            return 0;
        }
        if(s1.charAt(length)==s2.charAt(length1))
        {
            return 1+getlcs(s1,s2,length-1,length1-1);
        }
        return Math.max(getlcs(s1,s2,length-1,length1),getlcs(s1,s2,length,length1-1));

    }

    /*
    * Moving to DP problem
    * Time Complexity -->O(N^2)
    * Space Complexity-->O(N^2)
    * */

    public static int lcsDP(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                System.out.println(dp[i][j]);
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        int result=LongestCommonSubsequence.lcsDP("acbg","abde");
        System.out.println("LCS of the given String is : "+result);
    }


}
