// String Compression.

// 1. You are given a string. 
// 2. You have to compress the given string in the following two ways : 
//    First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//    For "aaabbccdee", the compressed string will be "abcde".
//    Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//    For "aaabbccdee", the compressed string will be "a3b2c2de2".

// Input Format :

// A String

// Output Format :

// Two strings representing first compressed string and second compressed string respectively

// Constraints :

// 1 <= length of string <= 1000

// Sample Input :

// wwwwaaadexxxxxx

// Sample Output :

// wadex
// w4a3dex6


import java.util.Scanner;
public class StringCompression
{
    // Second Compression.
    public static String secondCompression(String str)
    {
        int n = str.length();
        String result = "";
        result += str.charAt(0);
        int i = 1;
        while(i < n)
        {
            int count = 1;
            while(i < n && result.charAt(result.length() - 1) == str.charAt(i))
            {
                i++;
                count++;
            }
            if(count > 1)
            {
                result += count;
            }
            if(i < n)
            {
                result += str.charAt(i);
            }
            i++;
        }
        return result;
    }

    // First Compression.
    public static String firstCompression(String str)
    {
        int n = str.length();
        String result = "";
        result += str.charAt(0);
        int i = 1;
        while(i < n)
        {
            while(i < n && result.charAt(result.length() - 1) == str.charAt(i))
            {
                i++;
            }
            if(i < n)
            {
                result += str.charAt(i);
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(firstCompression(str));
        System.out.print(secondCompression(str));
    }
}
