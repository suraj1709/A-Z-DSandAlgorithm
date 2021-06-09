package com.ds.algo.tree;

public class BalanceBinaryTree {

    public static int balanceBinaryTree(BinaryTree.Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int l=balanceBinaryTree(node.left);
        int r=balanceBinaryTree(node.right);
        if(Math.abs(l-r)>1 || l==-1 || r==-1)
        {
            return -1;
        }
        return Math.max(l,r)+1;
    }

    public static void main(String[] args) {
        int result=BalanceBinaryTree.balanceBinaryTree(BinaryTree.createBinaryTree(new int[]{6,8,4,3,10,9,1,2,15}));
        String value=result>0?"YES":"NO";
        System.out.println(" Is Tree is Balance : "+ value);
    }
}
