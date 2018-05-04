/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F151;

import java.util.Arrays;

/**
 *
 * @author khaled helal
 */
public class Q1_c 
{
    public static void main (String [] args)
    {
        int[] a = {1, 7, 6, 5, 4, 2, 8, 9};
        int i = 0; int sum = 0;
        while (i < a.length){
            if (i % 2 == 0){
                i++;
            continue;
            }
            System.out.print(i + " ");
            sum = sum + a[i];
            if (i >= 5) break;
            i++;
        }
        System.out.print(sum + " ");
        System.out.println();
        System.out.println(Arrays.binarySearch(a, 8));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
