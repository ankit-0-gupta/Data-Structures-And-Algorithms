// Any Base Multiplication.

// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to multiply n1 and n2 and print the value.

// Input Format :

// A base b
// A number n1
// A number n2

// Output Format :

// A number of base b equal in value to n1 * n2

// Constraints :

// 2 <= b <= 10
// 0 <= n1 <= 10000
// 0 <= n2 <= 10000

// Sample Input :

// 5
// 1220
// 31

// Sample Output :

// 43320


import java.util.Scanner;
public class AnyBaseMultiplication
{
    // Any Base Addition.
    public static int anyBaseAddition(int b, int n1, int n2)
    {
        int answer = 0;
        int carry = 0;
        int power = 1;
        while(n1 != 0 || n2 != 0 || carry != 0)
        {
            int sum = carry + n1 % 10 + n2 % 10;
            answer += (sum % b) * power;
            carry = sum / b;
            n1 /= 10;
            n2 /= 10;
            power *= 10;
        }
        return answer;
    }

    // Multiply With Last Digit.
    public static int multiplyWithLastDigit(int b, int n1, int lastDigit)
    {
        int answer = 0;
        int carry = 0;
        int power = 1;
        while(n1 != 0 || carry != 0)
        {
            int multiply = ((n1 % 10) * lastDigit) + carry;
            answer += (multiply % b) * power;
            carry = multiply / b;
            n1 /= 10;
            power *= 10;
        }
        return answer;
    }

    // Any Base Multiplication.
    public static int anyBaseMultiplication(int b, int n1, int n2)
    {
        int answer = 0;
        int power = 1;
        while(n2 != 0)
        {
            int lastDigit = n2 % 10;
            n2 /= 10;
            int multiply = multiplyWithLastDigit(b, n1, lastDigit) * power;
            answer = anyBaseAddition(b, answer, multiply);
            power *= 10;
        }
        return answer;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.print(anyBaseMultiplication(b, n1, n2));
    }
}
