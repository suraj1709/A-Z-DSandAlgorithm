package com.ds.algo.dfs;

import com.ds.algo.tree.BinaryTree;

import java.util.Stack;

public class InOrderTraversal {

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
    public static void inOrderTraversal(Node node)
    {
        if(node==null)
        {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data+" ");
        inOrderTraversal(node.right);
    }

    public static void inOrderTraversal1(Node node)
    {
        System.out.println();
        Stack<Node> stack= new Stack<>();
        while(!stack.isEmpty() || node!=null)
        {
            if(node!=null)
            {
                stack.push(node);
                node=node.left;
            }
            else {
                node=stack.pop();
                System.out.print(node.data+" ");
                node=node.right;
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
        InOrderTraversal.inOrderTraversal(node);
        InOrderTraversal.inOrderTraversal1(node);

    }
}
