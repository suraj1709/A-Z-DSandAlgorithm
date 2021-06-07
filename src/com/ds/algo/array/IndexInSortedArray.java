package com.ds.algo.array;

public class IndexInSortedArray {
    /*

    nums=[1,2,3,3,4]
    key=3
    output 2,3
    * */

    public  static  int[] getIndexOfArray(int[] nums,int key)
    {


        /*
         *
         * Time Complexity :O(log n)
         * Space Complexity : O(1)
         *
         * */
        int first=FirstOccurrence.firstOccurrenceInSortedArray(nums,key);
        int second=LastOccurrence.lastOccurrenceInSortedArray(nums,key);
        if(first!=-1 && second!=-1)
        {
            return new int[]{first,second};
        }
        return new int[]{-1,-1};
    }



    public static void main(String[] args) {
        int[] result=IndexInSortedArray.getIndexOfArray(new int[]{1,2,2,2,2,3,3,3,4},3);
        System.out.println("First Occurrence is : " +result[0]+" Last Occurrence is "+ result[1]);
    }
}
