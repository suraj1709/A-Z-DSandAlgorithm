package com.ds.algo.dfs;

public class NoOfIsland {

    /*
    * Time Complexity is : O(N*M)
    * Space Complexity is : O(N*M)//CALL STACK
    *
    * Solved via DFS
    * */

    public static int noOfIsland(char[][] grid)
    {
        int noOfIsland=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    noOfIsland+=noOfIslandDFS(grid,i,j);
                }
            }
        }
        return noOfIsland;
    }

    private static int noOfIslandDFS(char[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>= grid.length || grid[i][j]=='0')
        {
            return 0;
        }
        grid[i][j]='0';
        noOfIslandDFS(grid,i+1,j);
        noOfIslandDFS(grid,i-1,j);
        noOfIslandDFS(grid,i,j+1);
        noOfIslandDFS(grid,i,j-1);
        return 1;
    }
    public static void main(String[] args) {
        int result=NoOfIsland.noOfIsland(new char[][]{{'1','1','0'},{'0','0','1'},{'1','1','0'}});
        System.out.println("No of island are  : " +result);
    }
}
