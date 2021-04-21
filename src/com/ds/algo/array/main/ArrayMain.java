package com.ds.algo.array.main;

import com.ds.algo.array.RemoveDuplicate;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        int[] input = {1, 1, 2, 2, 3};
        int ans = RemoveDuplicate.removeDuplicate(input);
        Arrays.stream(Arrays.copyOf(input, ans)).forEach(e -> System.out.println(e));

    }
}
