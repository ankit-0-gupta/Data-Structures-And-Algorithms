// Is A Number Prime.

// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

// Input Format :

// A number t
// A number n
// A number n
// .. t number of times

// Output Format :

// prime
// not prime
// not prime
// .. t number of times

// Constraints :

// 1 <= t <= 10000
// 2 <= n < 10^9

// Sample Input :

// 5
// 13
// 2
// 3
// 4
// 5

// Sample Output :

// prime
// prime
// prime
// not prime
// prime


import java.util.Scanner;
public class IsANumberPrime
{
    // Print Prime or Not Prime.
    public static void printPrimeNotPrime(int n)
    {
        boolean result = primeNotPrime(n);
        if(result == true)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }

    // Prime or Not Prime.
    public static boolean primeNotPrime(int n)
    {
        for(int i = 2; i * i <= n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    // // Prime or Not Prime.
    // public static boolean primeNotPrime(int n)
    // {
    //     for(int i = 2; i <= n / 2; i++)
    //     {
    //         if(n % i == 0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // // Prime or Not Prime.
    // public static boolean primeNotPrime(int n)
    // {
    //     for(int i = 2; i < n; i++)
    //     {
    //         if(n % i == 0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i = 1; i <= t; i++)
        {
            int n = scn.nextInt();
            primeNotPrime(n);
            printPrimeNotPrime(n);
        }
    }
}
