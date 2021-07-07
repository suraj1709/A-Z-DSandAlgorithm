package com.ds.algo.slidingwindow;

public class MinSubArraySum {

    public static int minSubArraySum(int[] arr,int k)
    {
        int result=Integer.MAX_VALUE;
        int sum=0;
        int j=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(i-j+1>=k)
            {
                if(result<sum)
                {
                    start=j;
                    end=i;
                }

                result=Math.min(result,sum);
                sum-=arr[j];
                j++;
            }
        }
        System.out.println("The index is from "+start+" to  "+end);
        return result;
    }

    public static void main(String[] args) {
        int result=MinSubArraySum.minSubArraySum(new int[]{10, 4, 2, 5, 6, 3, 8, 1},3);
        System.out.println("The result is : "+result);
    }
}
