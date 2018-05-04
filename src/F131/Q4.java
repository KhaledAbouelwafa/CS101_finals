/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F131;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author khaled helal
 */
public class Q4 
{
    public static void main (String [] args)
    {
        Scanner In = new Scanner (System.in);
        String s;
        do
        {
            System.out.println("Please type sentence");
            s = In.nextLine();
            String [] ARR = StringtoArray(s);
            String r = "the";
            if(searchNReplace(s, r, ARR)==false)
            {
                System.out.println("the Not found");
                System.out.println(Arrays.toString(ARR));
            }
            else
                System.out.println(Arrays.toString(ARR));
            System.out.println("Longest word is \"" + LongestStr(ARR)+"\"");
            
            System.out.println("Average length is " + AvgStrLen(ARR));
            
        }while(!s.equals(""));
    }
    public static String[] StringtoArray(String s)
    {
        String [] d = s.split(" ");
        return d;
    }
    public static boolean searchNReplace(String s, String r, String[]array)
    {
        boolean found = false;
        for (int i = 0; i < array.length; i++) 
        {
            if(array[i].equals(r))
            {    
                array[i]="THE";
                found = true;
            }
        }
        return found;
    }
    public static String LongestStr(String [] r)
    {
        int max =0;
        String d ="";
        for (int i = 0; i < r.length; i++) 
        {
            if(r[i].length()>max)
            {
                max = r[i].length();
                d= r[i];
            }
        }
        return d;
    }
    public static double AvgStrLen(String [] r)
    {
        double sum=0;
        for(int i = 0; i < r.length; i++) 
        {
            sum+=r[i].length();
        }
        return sum/r.length;
    }
}
