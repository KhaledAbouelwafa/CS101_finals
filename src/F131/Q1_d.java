/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F131;

/**
 *
 * @author khaled helal
 */
public class Q1_d 
{
    public static void main (String [] args)
    {
        int [] n = {3, 7, 1, 0, 25, 4, 18, -1, 5};
        mysteryB(n, 3, 1);
    }
    public static void mysteryB(int[] data, int x, int y) 
    {
        data[data[y]] = data[x];
        data[x] = y-1;
        
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
            
        }
    }


    
}
