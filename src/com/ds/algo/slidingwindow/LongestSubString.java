package com.ds.algo.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    //Long sub string with distinct character
    //Sliding window concept
    public static int longestKSubstring(String s)
    {
        Map<Character,Integer> map= new HashMap<>();//26 character //O(1)
        int[] character= new int[26];//We can use fixed array with 26 size as question defines it has lower case character.
        int j=0;
        int result=0;
        int low=0;
        int high=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1)
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
            if(result<i-j+1)
            {
                low=i;
                high=j;
            }
        }
        System.out.println(s.substring(low,high));
        return result;

    }
    public static void main(String[] args) {
        int result=LongestSubString.longestKSubstring("abcbdbdbbdcdabd");
        System.out.println("The result is : " +result);
    }
}
