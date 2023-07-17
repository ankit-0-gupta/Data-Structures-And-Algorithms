// Digits Of A Number.

// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line - wise.

// Input Format :

// "n" where n is any integer

// Output Format :

// d1
// d2
// d3
// ... digits of the number

// Constraints :

// 1 <= n < 10^9

// Sample Input :

// 65784383

// Sample Output :

// 6
// 5
// 7
// 8
// 4
// 3
// 8
// 3


import java.util.Scanner;
public class DigitsOfANumber
{
    // Power.
    public static int power(int n)
    {
        n /= 10;
        int power = 1;
        while(n != 0)
        {
            n /= 10;
            power *= 10;
        }
        return power;
    }

    // Digits Of A Number.
    public static void digitsOfANumber(int n)
    {
        int power = power(n);
        while(power != 0)
        {
            int quotient = n / power;
            n %= power;
            power /= 10;
            System.out.println(quotient);
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        digitsOfANumber(n);
    }
}
