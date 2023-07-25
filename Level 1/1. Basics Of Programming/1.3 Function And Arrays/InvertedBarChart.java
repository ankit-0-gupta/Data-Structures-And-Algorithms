// Inverted Bar Chart.

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print an inverted bar chart representing value of arr a.

// Input Format :

// A number n
// n1
// n2
// .. n number of elements

// Output Format :

// An inverted bar chart of asteriks representing value of array a

// Constraints :

// 1 <= n <= 30
// 0 <= n1, n2, .. n elements <= 10

// Sample Output :

// ** **
// *  **
// *  **
//    **
//    **
//    * 
//    * 


import java.util.Scanner;
public class InvertedBarChart
{   
    public static Scanner scn = new Scanner(System.in);

    // Maximum.
    public static int maximum(int[] a)
    {
        int maximum = a[0];
        for(int element : a)
        {
            maximum = Math.max(maximum, element);
        }
        return maximum;
    }

    // Inverted Bar Chart.
    public static void invertedBarChart(int[] a)
    {
        int n = a.length;
        int max = maximum(a);
        for(int i = 1; i <= max; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i <= a[j])
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Input.
    public static void input(int[] a)
    {
        int n = a.length;
        for(int i = 0; i < n; i++)
        {
            a[i] = scn.nextInt();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] a = new int[n];
        input(a);
        invertedBarChart(a);
    }
}
