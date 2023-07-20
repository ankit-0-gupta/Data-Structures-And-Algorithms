// Multiplication Table Pattern.

// 1. You are given a number n.
// 2. You've to write code to print it's multiplication table up to 10 in format given below.

// Input Format :

// A number x

// Output Format :

// x * 1 = x
// x * 2 = 2x
// x * 3 = 3x
// ..
// x * 10 = 10x

// Constraints :

// 1 <= n <= 10


import java.util.Scanner;
public class MultiplicationTablePattern
{
    // Multiplication Table Pattern.
    public static void multiplicationTablePattern(int x)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(x + " * " + i + " = " + (x * i));
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        multiplicationTablePattern(x);
    }
}
