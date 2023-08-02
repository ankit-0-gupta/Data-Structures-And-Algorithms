// Binary Search.


import java.util.Scanner;
public class BinarySearch
{
    public static Scanner scn = new Scanner(System.in);

    // Binary Search.
    public static int binarySearch(int[] arr, int element)
    {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(arr[mid] == element)
            {
                return mid;
            }
            else if(arr[mid] < element)
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
        System.out.print(binarySearch(arr, element));
    }
}
