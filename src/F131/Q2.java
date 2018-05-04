/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F131;

import java.io.File;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author khaled helal
 */
public class Q2 
{
    public static void main (String [] args)
            throws IOException
    {
        Scanner In = new Scanner (System.in);
        File f = new File ("output.txt");
        PrintWriter ff = new PrintWriter(f);
        int x =0;
        int [] a = new int [0];
        int j =0;
        
        while(true)
        {              
            x = readErrFreeInt(In);
            if(x==-111)
                break;
            a[j]=x;
            j++;
        }    
        
        int max=0;
        int maxpos=0;
        int min=0;
        int minpos=0;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max)
            {
                max=a[i];
                maxpos=i;
            }
            
        }
        ff.println(a[maxpos]);
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min)
            {
                min = a[i];
                minpos= i;
            }
            
        }
        ff.println(a[minpos]);
        ff.close();
    }
    
    public static int readErrFreeInt(Scanner In)
    {
        int x=0;
        do 
        {
            System.out.println("Type Integer");
            x = In.nextInt();
            
            if(!In.hasNextInt(x))
                System.out.println("please type again");
            
        }while(In.hasNextInt(x));
            
        return x;
    }
    
    
}
