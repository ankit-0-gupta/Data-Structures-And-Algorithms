// Any Base Subtraction.

// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to subtract n1 from n2 and print the value.

// Input Format :

// A base b
// A number n1
// A number n2

// Output Format :

// A number of base b equal in value to n2 - n1

// Constraints :

// 2 <= b <= 10
// 0 <= n1 <= 256
// 0 <= n2 <= 256

// Sample Input :

// 8
// 1
// 100

// Sample Output :

// 77


import java.util.Scanner;
public class AnyBaseSubtraction
{
    // Any Base Subtraction.
    public static int anyBaseSubtraction(int b, int n1, int n2)
    {
        int answer = 0;
        int borrow = 0;
        int power = 1;
        while(n1 != 0 || n2 != 0)
        {
            int difference = borrow + n2 % 10 - n1 % 10;
            if(difference < 0)
            {
                difference += b;
                borrow = -1;
            }
            else
            {
                borrow = 0;
            }
            answer += difference * power;
            n2 /= 10;  
            n1 /= 10;
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
        System.out.print(anyBaseSubtraction(b, n1, n2));
    }
}
