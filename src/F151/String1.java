/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F151;

import java.util.Scanner;

/**
 *
 * @author khaled helal
 */
public class String1 
{
    public static void main (String [] args)
    {
        System.out.println("Enter sentence");
        Scanner In = new Scanner (System.in);
        String s = In.nextLine();
        
        String [] d = s.split(" ");
        
        for (int i = d.length-1; i >=0; i--) 
        {
            System.out.println(d[i]);
        }
    }
    
}
