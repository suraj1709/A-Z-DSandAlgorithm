package com.ds.algo.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestKSubString {
    //Long sub string with distinct character with k
    //Sliding window concept
    public static int longestKthSubstring(String s,int k)
    {
        Map<Character,Integer> map= new HashMap<>();//26 character //O(1)
        int[] character= new int[26];//We can use fixed array with 26 size as question defines it has lower case character.
        int j=0;
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k)
            {
                char c=s.charAt(j);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                {
                    map.remove(c);
                }
                j++;
            }
            result=Math.max(result,i-j+1);

        }
        return result;

    }
    public static void main(String[] args) {
        int result=LongestKSubString.longestKthSubstring("abcbdbdbbdcdabd",2);
        System.out.println("The result is : " +result);
    }
}
