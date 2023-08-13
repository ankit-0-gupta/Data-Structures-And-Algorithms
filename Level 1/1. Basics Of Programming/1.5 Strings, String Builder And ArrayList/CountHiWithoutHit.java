// Count Hi Without Hit.

// Sample Input : 

// hihithihihitthit

// Sample Output : 

// 3


import java.util.Scanner;
public class CountHiWithoutHit
{
    // Count Hi Without Hit.
    public static int countHiWithoutHit(String str)
    {
        int n = str.length();
        int i = 0;                  
        int count = 0;
        while(i < n - 1)
        {
            if(str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
            {
                if((i + 2) < n && str.charAt(i + 2) == 't')
                {
                    i += 3;
                }
                else
                {
                    count++;
                    i += 2;
                }
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
        String str = scn.next();
        System.out.print(countHiWithoutHit(str));
    }
}
