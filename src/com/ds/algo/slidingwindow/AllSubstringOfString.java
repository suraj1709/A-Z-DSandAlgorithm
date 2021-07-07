package com.ds.algo.slidingwindow;

import java.util.*;

public class AllSubstringOfString {

    public static void getAllSubstring(String s,String element)
    {
        Set<Character> set=new HashSet<>();
        Set<Character> find=new HashSet<>();
        for(char character: element.toCharArray())
        {
            find.add(character);
        }
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(set.size()<find.size())
            {
                set.add(c);
            }
            else{
                if(set.containsAll(find)) {
                    System.out.println("The string value at index : "+j);
                }
                char ch = s.charAt(j);
                if(set.contains(ch)) {
                    set.remove(j);
                    j++;
                }
                set.add(c);
            }
        }

    }

    public static void main(String[] args) {
        AllSubstringOfString.getAllSubstring("XYYZXZYZXXYZ","XYZ");
    }
}
