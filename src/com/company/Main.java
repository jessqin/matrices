package com.company;

public class Main {

    public static void main(String[] args)
    {
	    int a [][] = {{1,2,-2,0},{-3,4,7,2},{6,0,3,1}};
        int b [][] = {{-1,3},{0,9},{1,-11},{4,-5}};

        int ans [][] = MatrixMult.mult(a,b);
        for (int row = 0; row<ans.length; row++)
        {
            for (int col = 0; col<ans[0].length; col++)
            {
                System.out.print(ans[row][col] + "\t");
            }
            System.out.println("");
        }

    }
}
