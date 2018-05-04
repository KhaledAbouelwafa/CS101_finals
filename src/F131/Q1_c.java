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
public class Q1_c 
{
    public static void main (String [] args)
    {
        int [] list = {8, 2, 10, 4, 10, 9};
        System.out.println(mysteryA(list));
    }
    public static int mysteryA (int[] list) {
        int x = 0;
        for (int i = 1; i < list.length; i++) {
            int y = list[i] - list[0];
            if (y > x) {
                x = y;
            }
        }
        return x;
    }

    
}
