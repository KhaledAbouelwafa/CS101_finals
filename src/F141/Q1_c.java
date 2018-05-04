/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F141;

/**
 *
 * @author khaled helal
 */
public class Q1_c 
{
    public static void main (String [] args)
    {
        int x= 0;
        int y= 0;
        for (int z = 0; z < 5; z++){
            if (( ++x > 2 ) && (++y > 2))
            {
                x++;
            }
        }
        System.out.println(x + " " + y);
    }
    
}
