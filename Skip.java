import java.util.Scanner;
public class Skip
{
    public static void main(String args[])
    {
        Scanner sk=new Scanner(System.in);
        int m,n,k;
        int i;
        System.out.println("enter the m value");
        m=sk.nextInt();
         System.out.println("enter the n value");
         n=sk.nextInt();
         System.out.println("enter the k value");
         k=sk.nextInt();
         for(i=m;i<=n;i=i+k+1)
         {
            System.out.println(i+" ");
         }

    }
}