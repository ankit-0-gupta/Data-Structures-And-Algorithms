// Binary To Decimal.

// Sample Input :

// 1010111

// Sample Output : 

// 87


import java.util.Scanner;
public class BinaryToDecimal
{
    // Binary To Decimal.
    public static int binaryToDecimal(int n)
    {
        int decimal = 0;
        int power = 1;
        while(n != 0)
        {
            int remainder = n % 10;
            n /= 10;
            decimal += remainder * power;
            power *= 2;
        }
        return decimal;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(binaryToDecimal(n));
    }
}
