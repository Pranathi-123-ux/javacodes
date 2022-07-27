import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int m=sc.nextInt();
		System.out.print("Enter number of coloumns:");
		int n=sc.nextInt();
		int arr[][]=new int[100][100];
		System.out.print("Enter the elements of the matrix:\n");
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		}
		System.out.print("The original matrix is :\n");
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println(" ");
		}
		int brr[][]=new int[100][100];
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        brr[j][i]=arr[i][j];
		    }
		}
		System.out.print("The transposing matrix is:\n");
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(brr[i][j]+" ");
		    }
		    System.out.println(" ");
		}
	}
}
