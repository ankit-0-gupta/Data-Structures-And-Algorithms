// Digit Frequency.

// 1. You are given a number n.
// 2. You are given a digit d.
// 3. You are required to calculate the frequency of digit d in number n.

// Input Format :

// A number n
// A digit d

// Output Format :

// A number representing frequency of digit d in number n

// Constraints :

// 0 <= n <= 10^9
// 0 <= d <= 9
  
// Sample Input :

// 994543234
// 4

// Sample Output :

// 3


import java.util.Scanner;
public class DigitFrequency
{   
    // Digit Frequency.
    public static int digitFrequency(int n, int d)
    {
        int frequency = 0;
        while(n != 0)
        {
            int lastDigit = n % 10;
            if(lastDigit == d)
            {
                frequency++;
            }
            n /= 10;
        }
        return frequency;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        System.out.print(digitFrequency(n, d));
    }
}
