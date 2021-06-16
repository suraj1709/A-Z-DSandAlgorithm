package com.ds.algo.stack;

import java.util.Stack;

public class MinimumElement {

    //Stack Push ,Pop ,Min
    /*
        Time Complexity is O(1)
        Space Complexity is O(N)
      * */

    private static Stack<Integer> stack=new Stack<>();
    private static Stack<Integer> minStack=new Stack<>();


    public static void push(int val)
    {
        if(!minStack.isEmpty())
        {
            int top=minStack.peek();
            if(top>val)
            {
                minStack.push(val);
            }
        }
        else {
            minStack.push(val);
        }
        stack.push(val);
    }
    public static int pop()
    {
        if(stack.isEmpty())
        {
            return -1;
        }
        if(!minStack.isEmpty() && stack.peek()==minStack.peek())
        {
            minStack.pop();
        }
        return stack.pop();
    }
    public static int min()
    {
        if(minStack.isEmpty())
        {
            return -1;
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinimumElement.push(3);
        MinimumElement.push(4);
        MinimumElement.push(8);
        MinimumElement.push(1);
        System.out.println("Min value is :"+ MinimumElement.min());
        MinimumElement.pop();
        MinimumElement.push(12);
        System.out.println("Min value is :"+ MinimumElement.min());


    }
}
