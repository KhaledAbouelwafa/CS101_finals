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
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Q3 
{
    public static void main (String [] args)
            throws IOException
    {
        File f = new File ("Words.txt");
        if(!f.exists())
        {
            System.out.println("file DNE");
            return;
        }
        Scanner In = new Scanner (f);
        int [] a = wordTallyCount(In);
        
        System.out.println(Arrays.toString(a));
    }
    public static int [] wordTallyCount(Scanner In)
    {
        int the=0;
        int of =0; 
        int a =0;
        int is =0;
        for (int i = 0; In.hasNext(); i++) 
        {
            String temp =In.next();
            
            if(temp.equals("the"))
                the++;
            else if(temp.equals("of"))
                of++;
            else if (temp.equals("a"))
                a++;
            else if (temp.equals("is"))
                is++;
        }
        int [] b = {the, of, a, is};
        return b;
    }
    
}
