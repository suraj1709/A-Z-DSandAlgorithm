package com.ds.algo.tree;

import com.ds.algo.array.ConstructBST;

public class BinaryTree {

     public static class Node
     {

         public int data;
         public Node left,right;
         public Node(int data)
         {
             this.data=data;
             left=null;
             right=null;
         }
     }
    // Create Binary Tree from a unsorted Array
    //[6,5,8,9,1]
     public static Node createBinaryTree(int[] arr)
     {
         Node root = null;
        for(int val: arr)
        {
            root=insert(root,val);
        }
        return root;
     }

    private static Node insert(Node root, int val) {
         if(root==null)
         {
            root=new Node(val);;
         }
         else if(root.data>val)
         {
             root.right=insert(root.right,val);
         }
         else if(root.data<val)
         {
             root.left=insert(root.left,val);
         }
         return root;
    }

    public static void main(String[] args) {
        Node node=BinaryTree.createBinaryTree(new int[]{6,8,4,3,10});
        System.out.println("-------In Order Traversal-------------");
        printInOrder(node);
    }

    private static void printInOrder(Node node) {

        if(node==null)
        {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.data+"  ");
        printInOrder(node.right);
    }
}
