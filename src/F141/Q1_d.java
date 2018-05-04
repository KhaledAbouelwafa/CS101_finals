/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F141;

import java.util.Arrays;

/**
 *
 * @author khaled helal
 */
public class Q1_d
{
    public static void main (String [] args)
    {
        int i=0;
        int [][] j = new int [5][5];
        do{
            i++;
            if(i%2==1){
                j[i][i]++;
                 continue;
             }
             if(i==4){
                 break;
             }
        }while(true);
        for(i=0;i<5;i++)
        {
            System.out.println(Arrays.toString(j[i]));
        }
        
        System.out.println(1%2);
    }
    
}
