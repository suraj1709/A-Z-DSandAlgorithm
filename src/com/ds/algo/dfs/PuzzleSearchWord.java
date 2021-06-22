package com.ds.algo.dfs;

public class PuzzleSearchWord {
    public static int[] row={1,-1,0,0};
    public static int[] col={0,0,1,-1};

    public static boolean searchWord(char[][] words,String searchString)
    {
        if(searchString.length()<=0)
        {
            return true;
        }
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(words[i][j]==searchString.charAt(0) && searchWord(words,i,j,searchString,0))
                {

                        return true;

                }
            }
        }return false;
    }

    private static boolean searchWord(char[][] words, int i, int j, String searchString, int count) {

        if(count==searchString.length())
        {
            return true;
        }
        if(isValid(words,i,j) || (words[i][j]!=searchString.charAt(count)))
        {
            return false;
        }
        char temp=words[i][j];
        boolean result = searchWord(words,i+1,j,searchString,count+1)
                ||searchWord(words,i-1,j,searchString,count+1)
                ||searchWord(words,i,j+1,searchString,count+1)
                ||searchWord(words,i,j-1,searchString,count+1);
        words[i][j]=temp;
        return result;

    }

    private static boolean isValid(char[][] words, int i, int j) {

        return (i<0 || i>=words.length || j<0 || j>=words[0].length);
    }

    public static void main(String[] args) {
        boolean result=PuzzleSearchWord.searchWord(new char[][]{{'C','G','F'},{'A','R','B'},{'K','D','C'}},"CARD");
        System.out.println("The search word is there :" +result);
    }
}
