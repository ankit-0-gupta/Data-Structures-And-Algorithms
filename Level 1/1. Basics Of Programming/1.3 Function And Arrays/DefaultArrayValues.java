// Default Array Values.

// If we don't assign values to the array element and try to access them, then the complier does not produce an
// error, it assign the values that are not garbage.

// DataType                Default Value
// int                     0
// double                  0.0
// boolean                 false
// String                  null
// User Defined Type       null


import java.util.Scanner;
public class DefaultArrayValues
{
    public static Scanner scn = new Scanner(System.in);

    // User Defined Type Array Default Value.
    public static void userDefinedTypeArray(int n)
    {
        DefaultArrayValues[] arr = new DefaultArrayValues[n];
        for(DefaultArrayValues element : arr)
        {
            System.out.print(element + " ");
        }
    }

    // String Type Array Default Value.
    public static void stringTypeArray(int n)
    {
        String[] arr = new String[n];
        for(String element : arr)
        {
            System.out.print(element + " ");
        }
    }

    // Boolean Type Array Default Value.
    public static void booleanTypeArray(int n)
    {
        boolean[] arr = new boolean[n];
        for(boolean element : arr)
        {
            System.out.print(element + " ");
        }
    }

    // Double Type Array Default Value.
    public static void doubleTypeArray(int n)
    {   
        double[] arr = new double[n];
        for(double element : arr)
        {
            System.out.print(element + " ");
        }
    }

    // Integer Type Array Default Value.
    public static void integerTypeArray(int n)
    {
        int[] arr = new int[n];
        for(int element : arr)
        {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args)
    {
        int n = scn.nextInt();
        integerTypeArray(n);
        System.out.println();
        doubleTypeArray(n);
        System.out.println();
        booleanTypeArray(n);
        System.out.println();
        stringTypeArray(n);
        System.out.println();
        userDefinedTypeArray(n);
    }
}
