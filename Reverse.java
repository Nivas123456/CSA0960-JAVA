import java.util.Scanner;
public class Reverse
{
    public static void main(String args[])
    {
       String a;
       String b;
       int c,i;
       Scanner rev=new Scanner(System.in);
       System.out.println("Enter the String");
       a=rev.nextLine();
       b="";
       c=a.length();
       for(i=c-1;i>=0;i--)
       {
        b=b+a.charAt(i);

    }
    System.out.println(b);
}
}