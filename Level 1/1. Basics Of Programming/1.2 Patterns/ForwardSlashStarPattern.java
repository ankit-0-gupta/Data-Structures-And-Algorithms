// Forward Slash Star Pattern.

// 1. You are given a number n.
// 2. You've to create a pattern of * as shown in output format.

// Input Format :

// A number n

// Output Format :
    
//      *
//     *
//    *
//   *
//  *
// *

// Constraints :

// 1 <= n <= 100


// Method 1 : (Using i, j)

// import java.util.Scanner;
// public class ForwardSlashStarPattern
// {
//     // Forward Slash Star Pattern.
//     public static void forwardSlashStarPattern(int n)
//     {
//         for(int i = 1; i <= n; i++)
//         {
//             for(int j = 1; j <= n; j++)
//             {
//                 if(i + j == n + 1)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//
//     public static void main(String[] args)
//     {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         forwardSlashStarPattern(n);
//     }
// }


// Method 2 : (Using nsp, nst variables)

import java.util.Scanner;
public class ForwardSlashStarPattern
{
    // Forward Slash Star Pattern.
    public static void forwardSlashStarPattern(int n)
    {
        int nsp = n - 1;
        int nst = 1;
        for(int row = 1; row <= n; row++)
        {
            for(int csp = 1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++)
            {
                System.out.print("*");
            }
            nsp--;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        forwardSlashStarPattern(n);
    }
}
