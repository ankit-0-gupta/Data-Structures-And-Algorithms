// String Builder Basics.


import java.util.*;
public class StringBuilderBasics
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("ab");
        System.out.println(sb.toString());
        sb.append("cd");
        System.out.println(sb.toString());
        sb.append('a');
        System.out.println(sb.toString());

        sb.setCharAt(4, 'e');
        System.out.println(sb.toString());

        sb.deleteCharAt(4);
        System.out.println(sb.toString());
    }
}
