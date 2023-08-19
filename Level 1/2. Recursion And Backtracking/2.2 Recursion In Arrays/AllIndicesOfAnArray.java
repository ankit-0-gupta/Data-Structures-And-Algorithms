// All Indices Of An Array.

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the all indices at which x occurs in array a.
// 5. Return an array of appropriate size which contains all indices at which x occurs in array a.

// Note : The online judge can't force you to write the function recursively but that is what the spirit of question is. 
//        Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Input Format : 

// A number n
// n1
// n2
// .. n number of elements
// A number x

// Output Format :

// Return the array of indices from the allIndices function. Display is managed for you

// Constraints :

// 1 <= n <= 10^4
// 0 <= n1, n2, .. n elements <= 10^3
// 0 <= x <= 10^3

// Sample Input :

// 6
// 15
// 11
// 40
// 4
// 4
// 9
// 4

// Sample Output :

// 3
// 4


import java.util.Scanner;
public class AllIndicesOfAnArray
{
    public static Scanner scn = new Scanner(System.in);

    // All Indices Of An Array.
    public static int[] allIndices(int[] a, int x, int idx, int count)
    {
        if(idx == a.length)
        {
            return new int[count];
        }
        if(a[idx] == x)
        {
            count++;
        }
        int[] recAns = allIndices(a, x, idx + 1, count);
        if(a[idx] == x)
        {
            recAns[count - 1] = idx;
        }
        return recAns;
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
        int x = scn.nextInt();
        int[] indices = allIndices(a, x, 0, 0);
        for(int element : indices)
        {
            System.out.println(element);
        }
    }
}
