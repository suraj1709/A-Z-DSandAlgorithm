package com.ds.algo.array;

public class ConstructBST {

    /*
     * Question Number 11:
     * Problem Statement :
     * Convert a sorted array into BST
     * Example :
     * Input : [1,2,3,4,5]
     * Output :
     * -------In Order Traversal-------------
                1  2  3  4  5
      -------Post Order Traversal-------------
                2  1  5  4  3
       -------Pre Order Traversal-------------
                 3  1  2  4  5

     *
     * */


    /*
     *Recursive Approach
     *
     * Time Complexity :O(n)
     * Space Complexity : O(1)
     *
     * */

    static class Tree{
        int data;
        Tree left,right;

        Tree(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }

    public static Tree  constructBST(int[] arr,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=start+(end-start)/2;
        Tree node= new Tree(arr[mid]);
        node.left=constructBST(arr,start,mid-1);
        node.right=constructBST(arr,mid+1,end);

        return node;
    }

    public static void main(String[] args) {
        Tree node=ConstructBST.constructBST(new int[]{1,2,3,4,5},0,4);
        System.out.println("-------In Order Traversal-------------");
        printInOrder(node);
        System.out.println("\n"+"-------Post Order Traversal-------------");
        printPostOrder(node);
        System.out.println("\n"+"-------Pre Order Traversal-------------");
        printPreOrder(node);

    }

    private static void printInOrder(Tree node)
    {
        if(node==null)
        {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.data+"  ");
        printInOrder(node.right);
    }

    private static void printPreOrder(Tree node)
    {
        if(node==null)
        {
            return;
        }
        System.out.print(node.data+"  ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    private static void printPostOrder(Tree node)
    {
        if(node==null)
        {
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data+"  ");
    }
}
