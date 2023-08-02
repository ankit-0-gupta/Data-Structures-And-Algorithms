// Decimal To Any Base.

// 1. You are given a decimal number n.
// 2. You are given a base b.
// 3. You are required to convert the number n into its corresponding value in base b.

// Input Format :

// A number n
// A base b

// Output Format :

// A number representing corresponding value of n in number system of base b

// Constraints :

// 0 <= d <= 512
// 2 <= b <= 10
  
// Sample Input :

// 57
// 2

// Sample Output :

// 111001


import java.util.Scanner;
public class DecimalToAnyBase
{
    // Decimal To Any Base.
    public static int decimalToAnyBase(int n, int b)
    {
        int answer = 0;
        int power = 1;
        while(n != 0)
        {
            int remainder = n % b;
            n /= b;
            answer += remainder * power;
            power *= 10;
        }
        return answer;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.print(decimalToAnyBase(n, b));
    }
}
