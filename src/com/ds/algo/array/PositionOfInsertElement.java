package com.ds.algo.array;

public class PositionOfInsertElement {

    public static int getPositionForInsert(char[] character,char key)
    {
        int start=0;
        int end=character.length;
        int mid;
        int result=0;
        while (start<end)
        {
            mid=start+(end-start)/2;

            if((int)character[mid]>=(int)key)
            {
                end=mid-1;
                result=end+1;

            }
            else {
                start=mid+1;
                result=start+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int position=PositionOfInsertElement.getPositionForInsert(new char[]{'a','b','c','d','e','f'},'d');
        System.out.println("Insert position is "+position);
    }


}
