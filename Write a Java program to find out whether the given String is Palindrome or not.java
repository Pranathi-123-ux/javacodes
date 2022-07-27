import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        String original_string,reversal_string = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        original_string= sc.nextLine();
        int n = original_string.length();
        for(int i = n - 1; i >= 0; i--)
        {
            reversal_string = reversal_string + original_string.charAt(i);
        }
        if(original_string.equalsIgnoreCase(reversal_string))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}