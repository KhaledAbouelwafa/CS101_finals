/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F131;

import java.util.Arrays;

/**
 *
 * @author khaled helal
 */
public class Q1_e 
{
    public static void main(String[] args) 
    {
        int x = 1;
        int[] a = new int[2];
        mysteryD(x, a);
        System.out.println(x + " " +Arrays.toString(a));
        x--;
        a[1] = a.length;
        mysteryD(x, a);
        System.out.println(x + " " + Arrays.toString(a));
        }
    public static void mysteryD(int x, int[] list) 
    {
        list[x]++;
        x++;
        System.out.println(x + " " + Arrays.toString(list));
    }
}
