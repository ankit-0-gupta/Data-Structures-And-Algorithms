// Spiral Display.

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n * m numbers, representing elements of 2-d array a.
// 4. You are required to traverse and print the contents of the 2-d array in form of a spiral.
// Note : Please check the sample output for details.

// Input Format :

// A number n
// A number m
// e11
// e12..
// e21
// e22..
// .. n * m number of elements

// Output Format :

// e11
// e21
// ..
// en1
// en2
// en3
// ..
// enm
// e(n - 1)m
// ..
// e1m
// e1(m - 1)
// ..
// e12
// e22
// e32
// ..

// Constraints :

// 1 <= n <= 10^2
// 1 <= m <= 10^2
// -10^9 <= e1, e2, .. n * m elements <= 10^9

// Sample Input :

// 3
// 5
// 11
// 12
// 13
// 14
// 15
// 21
// 22
// 23
// 24
// 25
// 31
// 32
// 33
// 34
// 35

// Sample Output :

// 11
// 21
// 31
// 32
// 33
// 34
// 35
// 25
// 15
// 14
// 13
// 12
// 22
// 23
// 24


import java.util.Scanner;
public class SpiralDisplay
{
    public static Scanner scn = new Scanner(System.in);

    // Spiral Display.
    public static void spiralDisplay(int[][] a)
    {   
        int n = a.length;
        int m = a[0].length;
        int rmin = 0;
        int cmin = 0;
        int rmax = n - 1;
        int cmax = m - 1;
        int totalElements = n * m;
        while(totalElements > 0)
        {
            for(int r = rmin; r <= rmax && totalElements > 0; r++)
            {
                System.out.println(a[r][cmin]);
                totalElements--;
            }
            cmin++;
            for(int c = cmin; c <= cmax && totalElements > 0; c++)
            {
                System.out.println(a[rmax][c]);
                totalElements--;
            }
            rmax--;
            for(int r = rmax; r >= rmin && totalElements > 0; r--)
            {
                System.out.println(a[r][cmax]);
                totalElements--;
            }
            cmax--;
            for(int c = cmax; c >= cmin && totalElements > 0; c--)
            {
                System.out.println(a[rmin][c]);
                totalElements--;
            }
            rmin++;
        }
    }

    // Input.
    public static void input(int[][] a)
    {
        int n = a.length;
        int m = a[0].length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                a[i][j] = scn.nextInt();
            }
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        input(a);
        spiralDisplay(a);
    }
}
