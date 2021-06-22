package com.ds.algo.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

    public static void floodFill(char[][] words,char replacement,int i,int j,char target)
    {
        if(replacement==target)
        {
            return;
        }
        if(i<0 ||i>=words.length ||j<0 || j>=words.length || words[i][j]!=target)
        {
            return;
        }
        target=words[i][j];
        words[i][j]=replacement;
        floodFill(words,replacement,i+1,j,target);
        floodFill(words,replacement,i-1,j,target);
        floodFill(words,replacement,i,j+1,target);
        floodFill(words,replacement,i,j-1,target);


    }

    static class Pair
    {
        int x;
        int y;

        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public static int[] row={1,-1,0,0};
    public static int[] col={0,0,1,-1};
    public static char[][] floodFillBFS(char[][] words,int x,int y,char replacement)
    {
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(x,y));
        char target=words[x][y];
        while (!queue.isEmpty())
        {
            Pair node=queue.poll();
            int i=node.x;
            int j=node.y;
            words[i][j]=replacement;

            for(int k=0;k<4;k++)
            {
                if(isValid(words,i+row[k],j+col[k],target))
                {
                    queue.add(new Pair(i+row[k],j+col[k]));

                }
            }

        }
        return words;
    }

    public static boolean isValid(char[][] words,int i,int j,char target)
    {
        return (i>=0 && i<words.length && j>=0 && j<words[0].length && words[i][j]==target);
    }

    public static void main(String[] args) {
        char[][] flood=new char[][]{{'C','A','A'},{'R','A','B'},{'K','D','C'}};
        char[][] output=FloodFill.floodFillBFS(flood,1,1,'C');
        for(int i=0;i<output.length;i++)
        {
            for(int j=0;j<output[0].length;j++)
            {
                System.out.print(output[i][j]+" ");
            }
        }
        FloodFill.floodFill(flood,'C',1,1,flood[1][1]);

    }
}
