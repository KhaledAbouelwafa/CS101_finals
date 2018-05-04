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
public class Q1_e 
{
    public static void main (String [] args)
    {
        int[][] c = {{1, 17, 3}, {4, 8, 6}, {10, 12, 2}};
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.print(c[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
