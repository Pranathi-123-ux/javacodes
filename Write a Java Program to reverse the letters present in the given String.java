import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the string:");
	    String a=sc.nextLine();
	    String rs= "";
	    for(int i = a.length()-1; i>=0; i--)
	    {
	        rs = rs + a.charAt(i);
	    }
	    System.out.print("The reversed string of the '"+a+"' is: " );
	    System.out.println(rs);
	}
}
