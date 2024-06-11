import java.util.Scanner;
public class LcmGcd
{
    public static void main(String args[])
    {
        int a,b,lcm,hcf=1,i;
        Scanner he=new Scanner(System.in);
        System.out.println("Enter the a value");
        a=he.nextInt();
        System.out.println("Enter the b value");
        b=he.nextInt();
        for(i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        lcm=a*b/hcf;
        System.out.println("GCD:"+hcf);
        System.out.println("LCM:"+lcm);
        }
}