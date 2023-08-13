// ArrayList Basics.


import java.util.ArrayList;
public class ArrayListBasics
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        // Display the ArrayList.
        System.out.println(al);

        // Display Using For Each Loop.
        for(Integer element : al)
        {
            System.out.print(element + " ");
        }

        System.out.println();

        // Size.
        System.out.println(al.size());

        // Get Particular Index Value.
        System.out.println(al.get(1));

        // Remove.
        al.remove(2);
        System.out.print(al);
    }
}
