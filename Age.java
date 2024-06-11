import java.util.Scanner;
public class Age
{
    public static void main(String args[])
    {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the age");
        a=in.nextInt();
        if(a>18)
        {
            System.out.println("Eligible to vote");
        }
        else if(a<=0)
        {
            System.out.println("Enter valid age");
        }
        else
        {
            System.out.println("Eligible to vote after"+(18-a));
        }
    }
}