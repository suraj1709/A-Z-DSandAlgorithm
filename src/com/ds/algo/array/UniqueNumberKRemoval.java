package com.ds.algo.array;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class UniqueNumberKRemoval {

    public static int removeKNumber(int[] nums,int k)
    {
        Map<Integer,Integer> map= new LinkedHashMap<>();
        for(int val: nums)
        {
            map.put(val,map.getOrDefault(val,0)+1);
        }
        //Sort by Value
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparing(map::get));
        pq.addAll(map.keySet());
        while(k>0)
        {
            k-=map.get(pq.poll());
        }
        return k<0?pq.size()+1:pq.size();
    }

    public static void main(String[] args) {
        int result=UniqueNumberKRemoval.removeKNumber(new int[]{1,1,3,2,3,1,3,2,4},3);
        System.out.println("The Unique Number is "+result);
    }
}
