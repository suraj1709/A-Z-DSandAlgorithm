package com.ds.algo.bfs;

import com.ds.algo.dfs.PreOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {

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

    public static void levelOrderTraversal(Node node)
    {
        Queue<Node> queue= new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            System.out.print(queue.peek().data+" ");
            while (size>0)
            {
                node=queue.poll();
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
                size--;
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
        LeftViewOfBinaryTree.levelOrderTraversal(node);

    }
}
