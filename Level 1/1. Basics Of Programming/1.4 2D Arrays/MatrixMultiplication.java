// Matrix Multiplication.

// 1. You are given a number n1, representing the number of rows of 1st matrix.
// 2. You are given a number m1, representing the number of columns of 1st matrix.
// 3. You are given n1 * m1 numbers, representing elements of 2-d array a1.
// 4. You are given a number n2, representing the number of rows of 2nd matrix.
// 5. You are given a number m2, representing the number of columns of 2nd matrix.
// 6. You are given n2 * m2 numbers, representing elements of 2-d array a2.
// 7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output format.
// 8. If the two arrays can't be multiplied, print "Invalid input".

// Input Format :

// A number n1
// A number m1
// e11
// e12..
// e21
// e22..
// .. n1 * m1 number of elements of array a1
// A number n2
// A number m2
// e11'
// e12'..
// e21'
// e22'..
// .. n2 * m2 number of elements of array a2

// Output Format :

// e11' e12' e13' ..
// e21' e22' e23' ..
// .. elements of prd array

// Constraints :

// 1 <= n1 <= 10^2
// 1 <= m1 <= 10^2
// -10^9 <= e11, e12, .. n1 * m1 elements <= 10^9
// 1 <= n2 <= 10^2
// 1 <= m2 <= 10^2
// -10^9 <= e11', e12', .. n2 * m2 elements <= 10^9

// Sample Input :

// 2
// 3
// 10
// 0
// 0
// 0
// 20
// 0
// 3
// 4
// 1
// 0
// 1
// 0
// 0
// 1
// 1
// 2
// 1
// 1
// 0
// 0

// Sample Output :

// 10 0 10 0
// 0 20 20 40


import java.util.Scanner;
public class MatrixMultiplication
{
    public static Scanner scn = new Scanner(System.in);

    // Matrix Multiplication.
    public static void matrixMultiplication(int[][] a1, int[][] a2)
    {
        int n1 = a1.length;
        int m1 = a1[0].length;
        int n2 = a2.length;
        int m2 = a2[0].length;
        int[][] prd = new int[n1][m2];
        if(m1 == n2)
        {
            for(int i = 0; i < n1; i++)
            {
                for(int j = 0; j < m2; j++)
                {
                    for(int k = 0; k < m1; k++)
                    {
                        prd[i][j] += a1[i][k] * a2[k][j];
                    }
                }
            }
        }
        else
        {
            System.out.print("Invalid input");
            return;
        }

        // Accessing the values.
        for(int[] arr : prd)
        {
            for(int element : arr)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Input (a2).
    public static void input2(int[][] a2)
    {
        int n2 = a2.length;
        int m2 = a2[0].length;
        for(int i = 0; i < n2; i++)
        {
            for(int j = 0; j < m2; j++)
            {
                a2[i][j] = scn.nextInt(); 
            }
        }
    }

    // Input (a1).
    public static void input1(int[][] a1)
    {
        int n1 = a1.length;
        int m1 = a1[0].length;
        for(int i = 0; i < n1; i++)
        {
            for(int j = 0; j < m1; j++)
            {
                a1[i][j] = scn.nextInt(); 
            }
        }
    }

    public static void main(String[] args)
    {
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] a1 = new int[n1][m1];
        input1(a1);
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] a2 = new int[n2][m2];
        input2(a2);
        matrixMultiplication(a1, a2);
    }
}
