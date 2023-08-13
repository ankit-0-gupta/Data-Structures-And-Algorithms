// Remove All Primes.

// 1. You are given an ArrayList of positive integers.
// 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

// Note -> The order of elements should remain same.

// Input Format :

// A number N
// arr1
// arr2.. N numbers

// Output Format :

// An ArrayList

// Constraints :

// 1 <= N <= 10000

// Sample Input :

// 4
// 3 12 13 15

// Sample Output :

// [12, 15]


import java.util.Scanner;
import java.util.ArrayList;
public class RemoveAllPrimes
{   
    // Prime Or Not Prime.
    public static boolean isPrime(int n)
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

    // Remove All Primes.
    public static void removeAllPrimes(ArrayList<Integer> al)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer element : al)
        {
            if(!isPrime(element))
            {
                result.add(element);
            }
        }
        while(al.size() != 0)
        {
            al.remove(al.size() - 1);
        }
        for(Integer element : result)
        {
            al.add(element);
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i < n; i++)
        {
            al.add(scn.nextInt());
        }
        removeAllPrimes(al);  
        System.out.print(al);  
    }
}
