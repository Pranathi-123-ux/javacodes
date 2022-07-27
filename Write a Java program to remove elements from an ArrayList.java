// You are using Java
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        ArrayList<String>al=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            al.add(s);
        }
        System.out.println("Elements of First ArrayList: "+al);
        System.out.print("Enter the element which you want to remove:");
        String ele=sc.next();
        al.remove(ele);
        System.out.println("Elements of ArrayList after deletion: "+al);
        
        
    }
    
}