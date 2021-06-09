package com.ds.algo.tree;

public class DiameterOfTree {

    private static int dia=0;
    public static int diameterOfTree(BinaryTree.Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int l=diameterOfTree(node.left);
        int r=diameterOfTree(node.right);
        dia=Math.max(l+r+1,dia);
        return Math.max(l,r)+1;
    }
    public static void main(String[] args) {
        int result=DiameterOfTree.diameterOfTree(BinaryTree.createBinaryTree(new int[]{6,8,4,3,10,9,1,2,15}));
        System.out.println("Diameter of a tree is "+dia);
    }
}
