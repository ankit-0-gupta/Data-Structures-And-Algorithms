// Print Z.

// 1. You are required to print a 'z' of size 5 using '*'.

// Input Format :

// There is no input

// Output Format :

// *****
//    *
//   *
//  *
// *****

// Constraints :

// No Constraints


// Method 1 : (Using Five Println Statements)

// public class PrintZ
// {
//     public static void main(String[] args)
//     {
//         System.out.println("*****");
//         System.out.println("   *");
//         System.out.println("  *");
//         System.out.println(" *");
//         System.out.println("*****");
//     }
// }


// Method 2 : (Using only one Println Statement)

// public class PrintZ
// {
//     public static void main(String[] args)
//     {
//         System.out.println("*****\n   *\n  *\n *\n*****");
//     }
// }


// Method 3 : (Using Function and Five Println Statements)

// public class PrintZ
// {
//     // Function Creation for Print Z.
//     public static void printZ()
//     {
//         System.out.println("*****");
//         System.out.println("   *");
//         System.out.println("  *");
//         System.out.println(" *");
//         System.out.println("*****");
//     }
//
//     public static void main(String[] args)
//     {
//         // Function Calling.
//         printZ();
//     }
// }


// Method 4 : (Using Function and only one Println Statement)

public class PrintZ
{
    // Function Creation for Print Z.
    public static void printZ()
    {
        System.out.println("*****\n   *\n  *\n *\n*****");
    }

    public static void main(String[] args)
    {
        // Function Calling.
        printZ();
    }
}
