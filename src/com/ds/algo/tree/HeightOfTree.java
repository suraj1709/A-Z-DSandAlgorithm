package com.ds.algo.tree;

public class HeightOfTree {

    public static int maxHeight(BinaryTree.Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int l=maxHeight(node.left);
        int r=maxHeight(node.right);
        return Math.max(l,r)+1;
    }

    public static void main(String[] args) {
        int result=HeightOfTree.maxHeight(BinaryTree.createBinaryTree(new int[]{6,8,4,3,10}));
        System.out.println("Height of a tree is "+result);
    }
}
