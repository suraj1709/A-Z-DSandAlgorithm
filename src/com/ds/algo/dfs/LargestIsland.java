package com.ds.algo.dfs;

public class LargestIsland {

    public static int largestIsland(char[][] grid)
    {
        int maxIsland=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    maxIsland=Math.max(largestIslandDFS(grid,i,j),maxIsland);
                }
            }
        }
        return maxIsland;
    }

    private static int largestIslandDFS(char[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>= grid.length || grid[i][j]=='0')
        {
            return 0;
        }
        grid[i][j]='0';
        return largestIslandDFS(grid,i+1,j)
                +largestIslandDFS(grid,i-1,j)
                +largestIslandDFS(grid,i,j+1) + largestIslandDFS(grid,i,j-1) + 1;
    }
    public static void main(String[] args) {
        int result=LargestIsland.largestIsland(new char[][]{{'1','1','0'},{'1','0','1'},{'1','1','0'}});
        System.out.println("Largest island is  : " +result);
    }
}
