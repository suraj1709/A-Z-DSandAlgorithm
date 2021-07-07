package com.ds.algo.dfs;

import java.util.Stack;

public class PreOrderTraversal {

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
    //Recursive Approach O(n)
    public static void preOrderTraversal(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.print(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void preOrderTraversal1(Node node)
    {
        System.out.println();
        Stack<Node> stack= new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()) {
            node = stack.pop();
            System.out.print(node.data+" ");
            if (node.right != null) {
                stack.push(node.right);

            }
            if (node.left != null) {
                stack.push(node.left);
            }
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
        PreOrderTraversal.preOrderTraversal(node);
        PreOrderTraversal.preOrderTraversal1(node);

    }
}
