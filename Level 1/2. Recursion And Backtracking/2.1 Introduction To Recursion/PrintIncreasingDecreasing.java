// Print Increasing Decreasing.

// Sample Input : 

// 5

// Sample Output :

// 1
// 2
// 3
// 4
// 5
// 5
// 4
// 3
// 2
// 1


import java.util.Scanner;
public class PrintIncreasingDecreasing
{
    // Print Increasing Decreasing.
    public static void printIncreasingDecreasing(int n, int i)
    {
        if(i > n)
        {
            return;
        }
        System.out.println(i);
        printIncreasingDecreasing(n, i + 1);
        System.out.println(i);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasingDecreasing(n, 1);
    }
}
