// Print All Primes Till N.

// 1. You've to print all prime numbers between a range. 
// 2. Take as input "low", the lower limit of range.
// 3. Take as input "high", the higher limit of range.
// 4. For the range print all the primes numbers between low and high (both included).

// Input Format :

// low 
// high

// Output Format :

// n1
// n2
// .. all primes between low and high (both included)

// Constraints :

// 2 <= low < high < 10^6

// Sample Input :

// 6 
// 24

// Sample Output :

// 7
// 11
// 13
// 17
// 19
// 23


import java.util.Scanner;
public class PrintAllPrimesTillN
{
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

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int i = low; i <= high; i++)
        {
            if(primeNotPrime(i))
            {
                System.out.println(i);
            }
        }
    }
}
