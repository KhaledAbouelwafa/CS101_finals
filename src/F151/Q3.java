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
public class Q3 
{
    public static void main (String [] args)
    {
        Scanner In = new Scanner (System.in);
        System.out.println("Enter num of students");
        int num = In.nextInt();
        double[] a= new double[num];
        System.out.println("Enter scores ");
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=In.nextDouble();
        }
        
        double sum =0;
        
        for (int i = 0; i < a.length; i++) 
        {
            sum+=a[i];
        }
        double avg = sum/a.length;
        System.out.println("Average is " + avg);
        int above=0;
        int below=0;
        int equal=0;
        for (int i = 0; i < a.length; i++) 
        {
            if(a[i]>avg)
                above++;
            else if(a[i]<avg)
                below++;
            else
                equal++;
            
        }
        System.out.println("above average " + above);
        System.out.println("below average " + below);
        System.out.println("equals to average " + equal);
    }
 
}
