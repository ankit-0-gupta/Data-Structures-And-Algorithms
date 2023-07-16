// Even or Odd.

// Input Format : 

// A number n

// Output Format :

// Even or Odd

// Sample Input :

// 94

// Sample Output :

// Even


import java.util.Scanner;
public class EvenOrOdd
{
    // Print Even or Odd.
    public static void printEvenOdd(int n)
    {
        boolean result = evenOdd(n);
        if(result == true)
        {
            System.out.print("Even");
        }
        else
        {
            System.out.print("Odd");
        }
    }

    // Even Or Odd.
    public static boolean evenOdd(int n)
    {
        if(n % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        evenOdd(n);
        printEvenOdd(n);
    }
}
