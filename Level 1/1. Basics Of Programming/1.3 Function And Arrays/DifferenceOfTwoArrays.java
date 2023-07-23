// Difference Of Two Arrays.

// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to find the difference of two numbers represented by two arrays and print the resultant array (a2 - a1).

// Assumption : number represented by a2 is greater.

// Input Format :

// A number n1
// n1 number of elements line separated
// A number n2
// n2 number of elements line separated

// Output Format :

// A number representing difference of two numbers (a2 - a1), represented by two arrays

// Constraints :

// 1 <= n1, n2 <= 100
// 0 <= a1[i], a2[i] < 10
// number reresented by a1 is smaller than number represented by a2

// Sample Input :

// 3
// 2
// 6
// 7
// 4
// 1
// 0
// 0
// 0

// Sample Output :

// 7
// 3
// 3


import java.util.Scanner;
public class DifferenceOfTwoArrays
{
    public static Scanner scn = new Scanner(System.in);
    
    // Difference Of Two Arrays.
    public static void differenceOfTwoArrays(int[] a1, int[] a2)
    {
        int n1 = a1.length;
        int n2 = a2.length;
        int n3 = Math.max(n1, n2);
        int[] result = new int[n3];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = n3 - 1;
        int borrow = 0;
        while(k >= 0)
        {
            int difference = borrow + a2[j] - (i >= 0 ? a1[i] : 0);
            if(difference < 0)
            {
                difference += 10;
                borrow = -1;
            } 
            else
            {
                borrow = 0;
            }
            result[k] = difference;
            i--;
            j--;
            k--;
        }

        // Remove Zero's.
        boolean nonZeroFound = false;
        for(int element : result)
        {
            if(element != 0)
            {
                nonZeroFound = true;
            }
            if(foundZero)
            {
                System.out.println(element);
            }
        }       
    }

    // Input in array (a2).
    public static void input2(int[] a2)
    {
        int n = a2.length;
        for(int i = 0; i < n; i++)
        {
            a2[i] = scn.nextInt();
        }
    }

    // Input in array (a1).
    public static void input1(int[] a1)
    {
        int n = a1.length;
        for(int i = 0; i < n; i++)
        {
            a1[i] = scn.nextInt();
        }
    }

    public static void main(String[] args)
    {
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        input1(a1);
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        input2(a2);
        differenceOfTwoArrays(a1, a2);
    }
}
