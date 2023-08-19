// Find Element Method 2.

// Sample Input : 

// 10
// 12 3 2 4 34 3 4 2 2 7
// element : 2

// Sample Output :
 
// true


import java.util.Scanner;
public class FindElementMethod2
{
    public static Scanner scn = new Scanner(System.in);

    // Find Element.
    public static boolean findElement(int[] a, int element, int idx)
    {
        if(idx == a.length)
        {
            return false;
        }
        boolean recAns = findElement(a, element, idx + 1);
        if(recAns)
        {
            return true;
        }
        return a[idx] == element;
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
        int element = scn.nextInt();
        System.out.print(findElement(a, element, 0));
    }
}
