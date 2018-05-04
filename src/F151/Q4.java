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
public class Q4 
{
    public static void main (String [] args)
    {
        String [] names = new String [10];
        double [][] sales = new double [10][12];
        fill(names, sales);
        show(names, sales);
        double sum = totalsales(sales);
        System.out.println("The overall sales for all salesmen is " + sum);
        Scanner In = new Scanner (System.in);
        System.out.println("Enter name to find");
        String name = In.next();
        int index = findindex(name, names);
        double sum1 = salesmanSales(index, sales);
        System.out.println("The sales for " + name + " is " + sum1);
        System.out.println("Enter month to sum");
        int month = In.nextInt();
        double sum2 = monthSales(month, sales);
        System.out.println("The sales for month " + month + " is " + sum2);
    }
    public static void fill (String[]names, double[][]sales)
    {
        Scanner In = new Scanner (System.in);
        for (int i = 0; i < names.length; i++) 
        {
            System.out.println("Enter name num " + (i+1));
            String name = In.next();
            names[i] = name;
            
            for (int j = 0; j < sales[i].length; j++) 
            {
                System.out.println("Enter sales for month num " +(j+1));
                double sale = In.nextDouble();
                sales[i][j]=sale;
            }
        }
    }
    public static double totalsales(double [][]sales)
    {
        double sum=0;
        for (int i = 0; i < sales.length; i++) 
        {
            for (int j = 0; j < sales[i].length; j++) 
            {
                sum += sales[i][j];
            }
        }
        return sum;
    }
    public static int findindex(String name, String[]names)
    { 
        int index=0;
        for (int i = 0; i < names.length; i++) 
        {
            if(name.equals(names[i]))
                index=i;
        }
        return index;
    }
    public static double salesmanSales(int index, double[][]sales)
    {
        double sum=0;
        for (int i = 0; i < 12; i++) 
        {
            sum+=sales[index][i];
        }
        return sum;
    }
    public static double monthSales(int month, double[][] sales)
    {
        double sum =0;
        for (int i = 0; i < sales.length; i++) 
        {
            sum+=sales[i][month-1];
        }
        return sum;
    }
    public static void show (String [] names, double[][]sales)
    {
        for (int i = 0; i < sales.length; i++) 
        {
            System.out.print(names[i] + " ");
            for (int k = 0; k < sales[i].length; k++) 
            {
                System.out.print(sales[i][k] + " ");
            }
            System.out.println();
        }  
    }
}
