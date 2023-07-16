// Multiplication Table from 1 to N.

// Input Format : 

// A number n

// Output Format : 

// Multiplication Table from 1 to N

// Sample Input :

// 3

// Sample Output :

// 1 * 1 = 1
// 1 * 2 = 2
// 1 * 3 = 3
// 1 * 4 = 4
// 1 * 5 = 5
// 1 * 6 = 6
// 1 * 7 = 7
// 1 * 8 = 8
// 1 * 9 = 9
// 1 * 10 = 10

// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// 2 * 4 = 8
// 2 * 5 = 10
// 2 * 6 = 12
// 2 * 7 = 14
// 2 * 8 = 16
// 2 * 9 = 18
// 2 * 10 = 20

// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
// 3 * 4 = 12
// 3 * 5 = 15
// 3 * 6 = 18
// 3 * 7 = 21
// 3 * 8 = 24
// 3 * 9 = 27
// 3 * 10 = 30


import java.util.Scanner;
public class MultiplicationTableFrom1ToN
{
    // Multiplication Table.
    public static void multiplicationTable(int n)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++)
        {
            multiplicationTable(i);
            System.out.println();
        } 
    }
}
