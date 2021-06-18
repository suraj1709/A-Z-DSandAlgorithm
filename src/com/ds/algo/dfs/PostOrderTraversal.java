package com.ds.algo.dfs;

import java.util.Stack;

public class PostOrderTraversal {
    static class Node
    {
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }
    //Recursive Approach O(2^n)
    public static void postOrderTraversal(Node node)
    {
        if(node==null)
        {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+" ");
    }

    public static void preOrderTraversal1(Node node)
    {
        System.out.println();
        Stack<Node> stack= new Stack<>();
        Stack<Integer> ans= new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()) {
            node = stack.pop();
            ans.push(node.data);
            if (node.left != null) {
                stack.push(node.left);

            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        while (!ans.isEmpty())
        {
            int cur=ans.pop();
            System.out.print(cur+" ");
        }
    }

    public static void main(String[] args) {
        Node node= new Node(5);
        node.right= new Node(6);
        node.left=new Node(4);
        node.left.left=new Node(7);
        node.left.right=new Node(9);
        node.right.left=new Node(0);
        node.right.right=new Node(1);
        PostOrderTraversal.postOrderTraversal(node);
        PostOrderTraversal.preOrderTraversal1(node);
    }
}
