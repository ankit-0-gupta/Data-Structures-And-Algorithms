// Any Base To Any Base.

// 1. You are given a number n.
// 2. You are given a base b1. n is a number on base b.
// 3. You are given another base b2.
// 4. You are required to convert the number n of base b1 to a number in base b2.

// Input Format :

// A number n
// A base b1
// A base b2

// Output Format :

// A number of base b2 equal in value to n of base b1

// Constraints :

// 0 <= n <= 512
// 2 <= b1 <= 10
// 2 <= b2 <= 10

// Sample Input :

// 111001
// 2
// 3

// Sample Output :

// 2010


import java.util.Scanner;
public class AnyBaseToAnyBase
{
    // Decimal To Any Base.
    public static int decimalToAnyBase(int n, int b2)
    {
        int answer = 0;
        int power = 1;
        while(n != 0)
        {
            int remainder = n % b2;
            n /= b2;
            answer += remainder * power;
            power *= 10;
        }
        return answer;
    }

    // Any Base To Decimal.
    public static int anyBaseToDecimal(int n, int b1)
    {
        int answer = 0;
        int power = 1;
        while(n != 0)
        {
            int remainder = n % 10;
            n /= 10;
            answer += remainder * power;
            power *= b1;
        }
        return answer;
    }

    // Any Base To Any Base.
    public static int anyBaseToAnyBase(int n, int b1, int b2)
    {
        int result = anyBaseToDecimal(n, b1);
        return decimalToAnyBase(result, b2);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        System.out.print(anyBaseToAnyBase(n, b1, b2));
    }
}
