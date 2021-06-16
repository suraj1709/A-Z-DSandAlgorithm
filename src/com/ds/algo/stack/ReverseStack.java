package com.ds.algo.stack;

import java.util.Stack;

public class ReverseStack {



    //Recursion Way
    public static void reverseStack(Stack<Integer> stack)
    {
        if(stack.empty())
        {
            return;
        }
        int value=stack.pop();
        reverseStack(stack);
        insertStack(stack,value);

    }

    private static void insertStack(Stack<Integer> stack, int value) {
        if(stack.isEmpty())
        {
            stack.push(value);
            return;
        }
        int reverse=stack.pop();
        insertStack(stack,value);
        stack.push(reverse);
    }

    //Iterative Way
    public static Stack<Integer> getReverseStack(Stack<Integer> stack)
    {

        Stack<Integer> result= new Stack<>();
        while(!stack.isEmpty())
        {
            int value=stack.pop();
            result.push(value);
        }
        return result;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<10;i++)
        {
            stack.push(i);
        }

        Stack<Integer> result=ReverseStack.getReverseStack(stack);
        ReverseStack.reverseStack(stack);
        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }

        while (!result.isEmpty())
        {
            System.out.println(result.pop());
        }

    }
}
