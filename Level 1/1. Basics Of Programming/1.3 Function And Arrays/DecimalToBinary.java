// Decimal To Binary.

// Sample Input : 

// 87

// Sample Output : 

// 1010111


import java.util.Scanner;
public class DecimalToBinary
{
    // Decimal To Binary.
    public static int decimalToBinary(int n)
    {
        int binary = 0;
        int power = 1;
        while(n != 0)
        {
            int remainder = n % 2;
            n /= 2;
            binary += remainder * power;
            power *= 10; 
        }
        return binary;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(decimalToBinary(n));
    }
}
