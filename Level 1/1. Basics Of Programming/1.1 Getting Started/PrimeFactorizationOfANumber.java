// Prime Factorization Of A Number.

// 1. You are required to display the prime factorization of a number.
// 2. Take as input a number n.
// 3. Print all its prime factors from smallest to largest.

// Input Format :

// n, an integer

// Output Format :

// p1  p2  p3  p4.. all prime factors of n

// Constraints :

// 2 <= n < 10^9

// Sample Input :

// 1440

// Sample Output :

// 2 2 2 2 2 3 3 5


import java.util.Scanner;
public class PrimeFactorizationOfANumber
{
    // Prime Factorization Of A Number.
    public static void primeFactorization(int n)
    {
        for(int divisor = 2; divisor * divisor <= n; divisor++)
        {
            while(n % divisor == 0)
            {
                System.out.print(divisor + " ");
                n /= divisor;
            }
        }
        if(n != 1)
        {
            System.out.print(n);
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        primeFactorization(n);
    }
}
