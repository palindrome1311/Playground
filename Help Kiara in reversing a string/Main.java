//program to reverse a string using recursion in Java

import java.util.Scanner;
public class Main
{
    public static String reverse_string(String rev)
    {
        if (rev.isEmpty()){
            return rev;
        }
        rev.substring(1);
        return reverse_string(rev.substring(1)) + rev.charAt(0);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse_string(str));
    }
}