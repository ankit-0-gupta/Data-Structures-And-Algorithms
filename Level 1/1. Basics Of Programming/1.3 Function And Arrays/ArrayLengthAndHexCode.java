// Array Length And HexCode.


import java.util.Scanner;
public class ArrayLengthAndHexCode
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        // Array Length.
        System.out.println(arr.length);

        // HexCode.
        System.out.print(arr);
    }
}
