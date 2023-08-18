// Dry Run Question 1.


public class DryRunQuestion1
{
    public static int recursiveTree(int n)
    {
        if(n <= 1)
        {
            System.out.println("Base : " + n);
            return n + 1;
        }
        int count = 0;
        System.out.println("Pre : " + n);
        count += recursiveTree(n - 1);
        System.out.println("In : " + n);
        count += recursiveTree(n - 2);
        System.out.println("Post : " + n);
        return count + 3;
    }

    public static void main(String[] args)
    {
        int n = 5;
        recursiveTree(n);
    }
}
