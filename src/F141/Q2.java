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
public class Q2 
{
    public static void main (String[]args)
    {
        int n =100;
        countDigits(n);
    }
    public static void countDigits(int n)
    {
        int [] a = new int[10];
        for (int i = 0; i < n; i++) 
        {
            a[(int)(Math.random()*10)]++;
        }
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(i + " appears " + a[i] + " times");
        }
    }
}
