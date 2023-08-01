// Digit Frequency For Queries.

// Sample Input : 

// n = 94994698256
// q = 5
// 9 4 5 7 6

// Sample Output : 

// 4 2 1 0 2

// Constraints :

// 0 <= n <= 10^18
// 0 <= d <= 18
// 0 <= q <= 10^9


import java.util.Scanner;
public class DigitFrequencyForQueries
{   
    public static Scanner scn = new Scanner(System.in);

    // Digit Frequency For Queries.
    public static void digitFrequency(long n, int[] queries)
    {
        int[] frequency = new int[10];
        while(n != 0)
        {
            long lastDigit = n % 10;
            frequency[(int)lastDigit]++;
            n /= 10;
        }
        
        // Accessing the Frequencies.
        for(int element : queries)
        {
            System.out.print(frequency[element] + " ");
        }
    }

    // Input.
    public static void input(int[] queries)
    {
        int n = queries.length;
        for(int i = 0; i < n; i++)
        {
            queries[i] = scn.nextInt();
        }
    }

    public static void main(String[] args)
    {
        long n = scn.nextLong();
        int q = scn.nextInt();
        int[] queries = new int[q];
        input(queries);
        digitFrequency(n, queries);
    }
}
