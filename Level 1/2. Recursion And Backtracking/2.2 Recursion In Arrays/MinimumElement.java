// Minimum Element.

// Sample Input :

// 6
// 15 30 40 4 11 9

// Sample Output :

// 4


import java.util.Scanner;
public class MinimumElement
{
    public static Scanner scn = new Scanner(System.in);

    // Minimum.
    public static int minOfAnArray(int[] a, int idx)
    {
        if(idx == a.length)
        {
            return (int)1e9;
        }
        return Math.min(minOfAnArray(a, idx + 1), a[idx]);
    }

    // Input.
    public static void input(int[] a)
    {
        int n = a.length;
        for(int i = 0; i < n; i++)
        {
            a[i] = scn.nextInt();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] a = new int[n];
        input(a);
        System.out.print(minOfAnArray(a, 0));
    }
}
