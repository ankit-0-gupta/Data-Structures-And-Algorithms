// Rotate A Number.

// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, 
//    rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. 
//    Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note : Assume that the number of rotations will not cause leading 0's in the result, e.g. such an input will not be given :
//    n = 12340056
//    k = 3
//    r = 05612340

// Input Format :

// "n" where n is any integer
// "K" where k is any integer

// Output Format :

// "r" the rotated number

// Constraints :

// 1 <= n < 10^9
// -10^9 < k < 10^9

// Sample Input :

// 562984
// 2

// Sample Output :

// 845629


import java.util.Scanner;
public class RotateANumber
{
    // Count Digits In A Number.
    public static int count_digits(int n)
    {
        int digits = 0;
        while(n != 0)
        {
            n /= 10;
            digits++;
        }
        return digits;
    }

    // Rotate A Number.
    public static int rotateANumber(int n, int k)
    {
        int digits = count_digits(n);
        k %= digits;
        if(k < 0)
        {
            k += digits;
        }
        int c = 1;
        int multiply = 1;
        for(int i = 1; i <= digits; i++)
        {
            if(i <= k)
            {
                c *= 10;
            }
            else
            {
                multiply *= 10;
            }
        }
        int a = n % c;
        int b = n / c;
        return (a * multiply + b);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.print(rotateANumber(n, k));
    }
}
