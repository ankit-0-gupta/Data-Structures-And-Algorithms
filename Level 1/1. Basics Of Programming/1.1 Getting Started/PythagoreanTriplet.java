// Pythagorean Triplet.

// 1. You are required to check if a given set of numbers is a valid Pythagorean triplet.
// 2. Take as input three numbers a, b and c.
// 3. Print true if they can form a Pythagorean triplet and false otherwise.

// Input Format :

// a, an integer
// b, an integer
// c, an integer

// Output Format :

// true if the numbers form a pythagorean triplet and false otherwise

// Sample Input :

// 5 3 4

// Sample Output :

// true


import java.util.Scanner;
public class PythagoreanTriplet
{
    // Pythagorean Triplet.
    public static boolean pythagoreanTriplet(int a, int b, int c)
    {
        return (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b); 
    }

    // // Pythagorean Triplet.
    // public static boolean pythagoreanTriplet(int a, int b, int c)
    // {
    //     int maximum = Math.max(Math.max(a, b), c);
    //     if(maximum == a && a * a == b * b + c * c)
    //     {
    //         return true;
    //     }
    //     else if(maximum == b && b * b == a * a + c * c)
    //     {
    //         return true;
    //     }
    //     else if(maximum == c && c * c == a * a + b * b)
    //     {
    //         return true;
    //     }
    //     else 
    //     {
    //         return false;
    //     }
    // }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.print(pythagoreanTriplet(a, b, c));
    }
}
