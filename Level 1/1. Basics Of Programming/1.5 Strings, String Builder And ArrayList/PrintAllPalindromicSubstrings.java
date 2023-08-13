// Print All Palindromic Substrings.

// 1. You are given a string. 
// 2. You have to print all palindromic substrings of the given string.

// Input Format :

// A String

// Output Format :

// All palindromic substrings(one in a line).
// First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

// Constraints :

// 1 <= length of string <= 500

// Sample Input :

// abcc

// Sample Output :

// a
// b
// c
// cc
// c


import java.util.Scanner;
public class PrintAllPalindromicSubstrings
{
    // Palindromic.
    public static boolean palindromic(String str, int i, int j)
    {
        while(i < j) 
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Print All Palindromic Substrings.
    public static void printAllPalindromicSubstrings(String str)
    {
        int n = str.length();
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j <= n; j++)
            {
                if(palindromic(str, i, j - 1))
                {
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printAllPalindromicSubstrings(str);
    }
}
