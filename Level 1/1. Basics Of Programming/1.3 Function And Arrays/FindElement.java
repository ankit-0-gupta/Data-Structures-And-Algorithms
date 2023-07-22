// Find Element.

// Sample Input 1 : 

// 7
// 10 -6 11 2 100 16 78
// element : 2

// Sample Output 1 :

// 3

// Sample Input 2 : 

// 7
// 10 -6 11 2 100 16 78
// element : -8

// Sample Output 2 :

// -1

// Sample Input 3 : 

// 7
// 10 -6 11 2 11 16 78
// element : 11

// Sample Output 3 :

// 2


import java.util.Scanner;
public class FindElement
{
    public static Scanner scn = new Scanner(System.in);

    // Find Element.
    public static int findElement(int[] arr, int element)
    {
        int n = arr.length;
        int foundAtIndex = -1;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == element)
            {
                foundAtIndex = i;
                break;
            }
        }
        return foundAtIndex;
    }

    // Input.
    public static void input(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int element = scn.nextInt();
        System.out.print(findElement(arr, element));
    }
}
