package com.ds.algo.array;

public class PrefixSum {

    /*
     *
     * Time Complexity :O(n)
     * Space Complexity : O(n)
     *
     * */
    private static int[] prefix;

    public static void prefixSum(int[] arr)
    {
        int val=0;
        prefix= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            prefix[i]=val+arr[i];
            val=prefix[i];
        }
    }

    public static int getPrefixSum(int start,int end)
    {
        if(start>=0 && end<prefix.length)
        {
            return prefix[end]-prefix[start-1];
        }
        return 0;
    }

    public static void main(String[] args) {

        PrefixSum.prefixSum(new int[]{2,6,8,9,1});
        int result=PrefixSum.getPrefixSum(1,3);
        System.out.println("Prefix Sum is : "+result);
    }

}
