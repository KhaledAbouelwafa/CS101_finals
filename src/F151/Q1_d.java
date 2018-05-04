/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F151;

import java.util.Arrays;

/**
 *
 * @author khaled helal
 */
public class Q1_d 
{
    public static void main (String [] args)
    {
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < b.length; i++){
            for(int j = i + 1; j < b[i].length; j++){
                int tmp = b[i][j];
                b[i][j] = b[j][i];
                b[j][i] = tmp;
            }
        }
        for(int i = 0; i < b.length; i++)
            System.out.println(Arrays.toString(b[i]));
    }
}
