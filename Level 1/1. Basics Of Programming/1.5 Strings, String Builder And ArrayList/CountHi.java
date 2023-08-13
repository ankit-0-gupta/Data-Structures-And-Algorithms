// Count Hi.

// Return the number of times that the string "hi" appears anywhere in the given string.

// countHi("abc hi ho") → 1
// countHi("ABChi hi") → 2
// countHi("hihi") → 2


import java.util.Scanner;
public class CountHi
{
    // Count Hi.
    public static int countHi(String str)
    {
        int n = str.length();
        int i = 0;
        int count = 0;
        while(i < n - 1)
        {
            if(str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
            {
                count++;
                i += 2;
            }
            else
            {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.print(countHi(str));
    }
}
