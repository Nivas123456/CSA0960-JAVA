import java.util.Scanner;
public class Valid
{
    public static void main(String args[])
    {
        Scanner va=new Scanner(System.in);
        String a;
        String b;
        System.out.println("Enter the first username");
        a=va.nextLine();
        System.out.println("Enter the second username");
        b=va.nextLine();
        if(a.equals(b))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}