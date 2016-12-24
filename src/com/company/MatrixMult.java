package com.company;

/**
 * Created by jq210 on 12/21/16.
 */
public class MatrixMult
{
    public static int[][] mult(int x[][], int y[][])
    {
        int product[][] = new int[x.length][y[0].length];

        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < y[0].length; j++)
            {
                for (int k = 0; k < x[0].length; k++)
                {
                    product[i][j] = product[i][j] + (x[i][k] * y[k][j]);
                }
            }
        }

        return product;

    }
}
