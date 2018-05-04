/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F131;

import java.lang.reflect.Array;

/**
 *
 * @author khaled helal
 */
public class Q1_b 
{
    public static void main (String [] args)
    {
        int [][] ARR = new int [3][3];
        
        int j =0;
        for(int i =ARR.length-1; i>=0; i--)
        {
            ARR[i][j]=j;
            j++;
        }
        
        for(int i =0; i<ARR.length; i++)
        {
            for(int k =0; k<ARR[i].length; k++)
                System.out.print(ARR[i][k]);
            System.out.println();
        }
    }
    
}
