// Any Base Addition.

// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to add the two numbes and print their value in base b.

// Input Format :

// A base b
// A number n1
// A number n2

// Output Format :

// A number representing the sum of n1 and n2 in base b

// Constraints :

// 2 <= b <= 10
// 0 <= n1 <= 256
// 0 <= n2 <= 256

// Sample Input :

// 8
// 777
// 1

// Sample Output :

// 1000


import java.util.Scanner;
public class AnyBaseAddition
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

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.print(anyBaseAddition(b, n1, n2));
    }
}
