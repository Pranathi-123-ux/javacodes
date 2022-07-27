import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int count=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[100];
		System.out.print("Enter the elements in array:");
		for(int i=0;i<n;i++)
		{
		        arr[i]=sc.nextInt();
		}
        for(int i=0;i<n;i++)
        {
            if(arr[arr[i]]==i)
            {
                count++;
            }
        }
        if(count!=0)
        {
            System.out.println("The array is mirror inverse");
        }
        else
        {
            System.out.println("The array is not mirror inverse");
        }
		
	}
}
