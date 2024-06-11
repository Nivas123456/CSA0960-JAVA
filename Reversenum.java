import java.util.Scanner;
public class Reversenum
{
    public static void main(String args[])
    {
        int n,rem,rev=0; 
        Scanner re=new Scanner(System.in);
        System.out.println("enter the n value");
        n=re.nextInt();
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse:"+rev);

    }
}