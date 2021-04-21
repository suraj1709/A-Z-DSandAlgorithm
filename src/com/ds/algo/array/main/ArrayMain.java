package com.ds.algo.array.main;

import com.ds.algo.array.ContainDuplicateI;
import com.ds.algo.array.MissingPositiveNumber;
import com.ds.algo.array.RemoveDuplicate;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        int[] inputQ1 = {1, 1, 2,2,3};
        int[] inputQ2 = {-1, 1,3};
        int Q1ans = RemoveDuplicate.removeDuplicate(inputQ1);
        Arrays.stream(Arrays.copyOf(inputQ1, Q1ans)).forEach(e -> System.out.println(e));
        int Q2ans = MissingPositiveNumber.missingPositiveNumber(inputQ2);
        System.out.println(Q2ans);
        boolean Q3ans=ContainDuplicateI.containsDuplicateApproach1(inputQ1);
        System.out.println(Q3ans);
        boolean Q3ans1=ContainDuplicateI.containsDuplicateApproach2(inputQ1);
        System.out.println(Q3ans1);

    }
}
