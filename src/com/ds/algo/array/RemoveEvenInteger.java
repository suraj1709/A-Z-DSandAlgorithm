package com.ds.algo.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveEvenInteger {

    /*
     * Question Number 4:
     * Problem Statement :
     * Remove Even Integer from a Array
     * Example :
     * Input : [1,2,3,4,5]
     * Output : [1,3,5]
     * */


    /*
    *
    * Time Complexity :O(n)
    * Space Complexity : O(n)
    *
    * */
    public static List<Integer> removeEvenInteger(int[] nums)
    {
        List<Integer> result= new ArrayList<>();
        for(int number: nums)
        {
            if(number%2!=0)
            {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> response=RemoveEvenInteger.removeEvenInteger(new int[]{1,2,3,4,5});
        for (int ans: response)
        {
            System.out.print(ans+ "  ");

        }
    }
}
