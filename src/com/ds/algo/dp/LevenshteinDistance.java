package com.ds.algo.dp;

public class LevenshteinDistance {

    /*
     * Exponential Time Complexity that is O(2^N)
     * Space Complexity is Call Stack that is length of String s1 and s2;
     * */

    public static int ld(String s1,String s2)
    {
        return getLd(s1,s2,s1.length()-1,s2.length()-1);
    }

    private static int getLd(String s1, String s2, int length, int length1) {

        if(length<=0)
        {
            return length1;
        }
        if(length1<=0)
        {
            return length;
        }

        if(s1.charAt(length)==s2.charAt(length1))
        {
            return getLd(s1,s2,length-1,length1-1);
        }
        else {
            return Math.min(getLd(s1,s2,length-1,length1-1),Math.min(getLd(s1,s2,length,length1-1),getLd(s1,s2,length-1,length1)))+1;
        }
    }


    public static int ldDP(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n+1][m+1];

        for(int i=0;i<n+1;i++)
        {
            dp[0][i]=i;
        }
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=i;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }

            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        int res=LevenshteinDistance.ldDP("abcg","abcde");
        System.out.println("Levenshtein Distance of the given String is : "+res);
    }

}
