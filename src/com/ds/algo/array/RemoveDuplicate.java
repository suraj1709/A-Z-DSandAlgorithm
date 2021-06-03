package com.ds.algo.array;
/*
* Question Number 1:
* Problem Statement :
* Remove Duplicate from a Shorted Array
* Example :
* Input : [1,2,2,3,3]
* Output : [1,2,3]
*
*/


/*
 *
 * Time Complexity :O(n)
 * Space Complexity : O(1)
 *
 * */
public class RemoveDuplicate {

    public static int[] removeDuplicate(int[] arr) {
        int n = arr.length;
        int count = n > 0 ? 1 : 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != arr[j]) {
                j++;
                count++;
                arr[j] = arr[i];
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] response=RemoveDuplicate.removeDuplicate(new int[]{1,2,2,3,3});
        for (int ans: response)
        {
            System.out.print(ans+ "  ");

        }
    }

}
