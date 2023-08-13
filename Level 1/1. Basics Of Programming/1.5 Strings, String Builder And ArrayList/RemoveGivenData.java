// Remove Given Data From The ArrayList.

// Sample Input :

// ArrayList : [10, 20, 10, 30, 40, 10, 50, 50, 50, 10, 10, 60, 10, 10, 70]
// data = 10

// Sample Output : 

// [50, 20, 60, 30, 40, 70, 50, 50]


import java.util.Scanner;
import java.util.ArrayList;
public class RemoveGivenData
{
    // Swap.
    public static void swap(ArrayList<Integer> al, int i, int j)
    {
        int temp = al.get(i);
        al.set(i, al.get(j));
        al.set(j, temp);
    }

    // Remove Given Data.
    public static void removeGivenData(ArrayList<Integer> al, int data)
    {
        int i = al.size() - 1;
        while(i >= 0)
        {
            if(al.get(i) == data)
            {
                swap(al, i, al.size() - 1);
                al.remove(al.size() - 1);
            }
            i--;
        }
    }

    public static void main(String[] args)
    {   
        ArrayList<Integer> al = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < 15; i++)
        {
            al.add(scn.nextInt());
        }
        int data = 10;
        removeGivenData(al, data);
        System.out.print(al);
    }
}
