// Toggle Case.

// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to toggle the case of every character of the given string.

// Input Format :

// A String

// Output Format :

// A String

// Constraints :

// 1 <= length of string <= 1000

// Sample Input :

// intErNeT

// Sample Output :

// INTeRnEt


import java.util.Scanner;
public class ToggleCase
{
    // Toggle Case.
    public static String toggleCase(String str)
    {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                sb.append((char)(ch - 'a' + 'A'));
            }
            else
            {
                sb.append((char)(ch - 'A' + 'a'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.print(toggleCase(str));
    }
}
