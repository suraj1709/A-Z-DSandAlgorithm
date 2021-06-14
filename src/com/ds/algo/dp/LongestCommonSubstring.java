package com.ds.algo.dp;

public class LongestCommonSubstring {

    /*

    Longest common substring -->S1="abcd" s2="abde" O/P="ab" -->2;
    * */
    private static int result;
    public static void lcsRecurssion(String s1,String s2)
    {
        getLcs(s1,s2,s1.length()-1,s2.length()-1);

    }

    private static int getLcs(String s1, String s2, int length, int length1) {
        if(length<0 || length1<0)
        {
            return 0;
        }
        if(s1.charAt(length)==s2.charAt(length1))
        {
            result=Math.max(result,1+getLcs(s1,s2,length-1,length1-1));
        }
         return 0;
    }

    public static int lcsDP(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();
        int result=0;
        int[][] dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                    result=Math.max(dp[i][j],result);
                }
                else
                {
                    dp[i][j]=0;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int res=LongestCommonSubstring.lcsDP("abcg","abcde");
        System.out.println("LCS of the given String is : "+res);
    }
}
