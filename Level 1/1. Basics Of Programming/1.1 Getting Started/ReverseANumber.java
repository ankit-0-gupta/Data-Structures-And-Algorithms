// Reverse A Number.

// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line - wise, but in reverse order.

// Input Format :

// "n" where n is any integer

// Output Format :

// d1
// d2
// d3
// ... digits of the number in reverse

// Constraints :

// 1 <= n < 10^9

// Sample Input :

// 65784383

// Sample Output :

// 3
// 8
// 3
// 4
// 8
// 7
// 5
// 6


import java.util.Scanner;
public class ReverseANumber
{
    // // Reverse A Number.
    // public static int reverse(int n)
    // {
    //     int reverse = 0;
    //     while(n != 0)
    //     {
    //         int remainder = n % 10;
    //         reverse = reverse * 10 + remainder;
    //         n /= 10;
    //     }
    //     return reverse;
    // }

    // Rverse A Number.
    public static void reverse(int n)
    {
        while(n != 0)
        {
            int remainder = n % 10;
            n /= 10;
            System.out.println(remainder);
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        reverse(n);
    }
}
