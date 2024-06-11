import java.util.Scanner;
public class AreaCircle
{
    public static void main(String args[])
    {
        int r;
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=sc.nextInt();
        a=(r*r)*3.14;
        System.out.println("Area:"+a);
    }
}
