// Sum Of Two Arrays.

// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to add the numbers represented by two arrays and print the resultant array.

// Input Format :

// A number n1
// n1 number of elements line separated
// A number n2
// n2 number of elements line separated

// Output Format :

// A number representing sum of two numbers, represented by two arrays

// Constraints :

// 1 <= n1, n2 <= 100
// 0 <= a1[i], a2[i] < 10

// Sample Input :

// 5
// 3
// 1
// 0
// 7
// 5
// 6
// 1
// 1
// 1
// 1
// 1
// 1

// Sample Output :

// 1
// 4
// 2
// 1
// 8
// 6


import java.util.Scanner;
public class SumOfTwoArrays
{
    public static Scanner scn = new Scanner(System.in);

    // Sum Of Two Arrays.
    public static void sumOfTwoArrays(int[] a1, int[] a2)
    {
        int n1 = a1.length;
        int n2 = a2.length;
        int n3 = Math.max(n1, n2) + 1;
        int[] result = new int[n3];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = n3 - 1;
        int carry = 0;
        while(k >= 0)
        {
            int sum = carry + (i >= 0 ? a1[i] : 0) + (j >= 0 ? a2[j] : 0);
            result[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }

        // Remove Zero.
        for(int index = 0; index < result.length; index++)
        {
            if(index == 0 && result[index] == 0)
            {
                continue;
            }
            System.out.println(result[index]);
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
        sumOfTwoArrays(a1, a2);
    }
}
