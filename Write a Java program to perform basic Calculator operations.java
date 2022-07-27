import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter frist number:");
        double n=sc.nextDouble();
        System.out.println("Enter second number:");
        double m=sc.nextInt();
        System.out.println("Enter operator which you want to perform:");
        char c=sc.next().charAt(0);
        switch(c)
        {
            case '*':
                System.out.println("The multiplication of two numbers:"+(n*m));
                break;
            case '+':
                System.out.println("The addition of two numbers:"+(n+m));
                break;
            case '-':
                System.out.println("The subraction of two numbers:"+(n-m));
                break;
            case '/':
                System.out.println("The division of two numbers:"+(n/m));
                break;
            default:
                   System.out.println("Operation is impossible");
        }
        
    }
}