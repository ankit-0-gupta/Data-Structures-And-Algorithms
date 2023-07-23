// Rotate An Array.

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. Rotate the array a, k times to the right (for positive values of k), and to
// the left for negative values of k.

// Input Format :

// Input is managed for you

// Output Format :

// Output is managed for you

// Constraints :

// 0 <= n < 10^4
// -10^9 <= a[i], k <= 10^9

// Sample Input :

// 5
// 1
// 2
// 3
// 4
// 5
// 3

// Sample Output :

// 3 4 5 1 2


// Extra Space.


import java.util.Scanner;
public class RotateAnArrayWithExtraSpace
{
    public static Scanner scn = new Scanner(System.in);

    // Rotate An Array.
    public static int[] rotateAnArray(int[] a, int k)
    {
        int n = a.length;
        k %= n;
        if(k < 0)
        {
            k += n;
        }
        int[] rotate = new int[n];
        for(int i = 0; i < n; i++)
        {
            rotate[(i + k) % n] = a[i];
        }
        return rotate;
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
        int k = scn.nextInt();
        int[] arr = rotateAnArray(a, k);
        for(int element : arr)
        {
            System.out.print(element + " ");
        }
    }
}
