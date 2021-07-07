package com.ds.algo.slidingwindow;

public class SubArraySumI {

    public static boolean getSubArraySum(int[] arr,int target)
    {
        int sum=0;
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            while(sum>target)
            {
                sum-=arr[j];
                j++;
            }
            if(sum==target)
            {
                System.out.println("The index is from "+j+" to  "+i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result=SubArraySumI.getSubArraySum(new int[]{2, 6, 0, 9, 7, 3, 1, 4, 1, 10},15);
        System.out.println("Is there a sum present : "+result);
    }
}
