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
import java.io.*;
public class Q3 
{
    public static void main (String [] args)
    {
        
    }
    public static void printRandom(File FOut)
            throws IOException
    {
        FOut = new File("random.txt");
        PrintWriter p = new PrintWriter(FOut);
        int line = 1;
        for (int i = 0; i < 100; i++) 
        {
            p.print((int)(Math.random()*10000) + " ");
            if(line ==5)
            {
                p.println();
                line=0;
            }
            line++;
        }
        p.close();
    }
}
