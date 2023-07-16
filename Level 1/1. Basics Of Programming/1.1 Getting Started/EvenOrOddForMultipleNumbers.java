// Even or Odd for Multiple Numbers.

// Sample Input : 

// 5 
// 12 23 345 76 0

// Sample Output :

// Even Odd Odd Even Even


import java.util.Scanner;
public class EvenOrOddForMultipleNumbers
{
    // Print Even or Odd.
    public static void printEvenOdd(int n)
    {
        boolean result = evenOdd(n);
        if(result == true)
        {
            System.out.print("Even ");
        }
        else
        {
            System.out.print("Odd ");
        }
    }

    // Even or Odd.
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
        int count = scn.nextInt();
        for(int i = 1; i <= count; i++)
        {
            int n = scn.nextInt();
            evenOdd(n);
            printEvenOdd(n);
        }
    }
}
