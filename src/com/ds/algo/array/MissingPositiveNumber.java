package com.ds.algo.array;

/*
 * Question Number 2:
 * Problem Statement :
 * First Smallest Missing Number
 * Example :
 * Input : [1,4,3]
 * Output : 2
 * */
public class MissingPositiveNumber {

    public static int missingPositiveNumber(int[] arr) {
        int n = arr.length;
        int currentPos;
        for (int i = 0; i < n; i++) {
            currentPos= arr[i] - 1;
            while (1 <= arr[i] && arr[i] <= n && arr[i] != arr[currentPos]) {
                swap(arr, currentPos, i);
                currentPos = arr[i] - 1;

            }
        }
        return findMissingNumber(arr);

    }

    private static int findMissingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                return i + 1;
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr, int swapIndex, int swapPos) {
        int temp = arr[swapIndex];
        arr[swapIndex] = arr[swapPos];
        arr[swapPos] = temp;
    }
}
