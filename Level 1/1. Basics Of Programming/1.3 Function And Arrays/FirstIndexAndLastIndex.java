// First Index And Last Index.

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// Asssumption : Array is sorted. Array may have duplicate values.

// Input Format :

// A number n
// n1
// n2
// .. n number of elements
// A number d

// Output Format :

// A number representing first index
// A number representing last index

// Constraints :

// 1 <= n <= 1000
// 1 <= n1, n2, .. n elements <= 100
// 1 <= d <= 100

// Sample Input :

// 15
// 1
// 5
// 10
// 15
// 22
// 33
// 33
// 33
// 33
// 33
// 40
// 42
// 55
// 66
// 77
// 33

// Sample Output 

// 5
// 9


import java.util.Scanner;
public class FirstIndexAndLastIndex
{   
    public static Scanner scn = new Scanner(System.in);

    // Last Index.
    public static int lastIndex(int[] a, int d)
    {
        int n = a.length;
        int low = 0;
        int high = n - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(a[mid] == d)
            {
                if(mid + 1 < n && a[mid + 1] == d)
                {
                    low = mid + 1;
                }
                else
                {
                    return mid;
                }
            }
            else if(a[mid] < d)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    // First Index.
    public static int firstIndex(int[] a, int d)
    {
        int n = a.length;
        int low = 0;
        int high = n - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(a[mid] == d)
            {
                if(mid - 1 >= 0 && a[mid - 1] == d)
                {
                    high = mid - 1;
                }
                else
                {
                    return mid;
                }
            }
            else if(a[mid] < d)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    // First Index And Last Index.
    public static void firstAndLastIndex(int[] a, int d)
    {
        System.out.println(firstIndex(a, d));
        System.out.print(lastIndex(a, d));
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
        int d = scn.nextInt();
        firstAndLastIndex(a, d);
    }
}
