import java.util.Scanner;
public class Simple
{
    public static void main(String args[])
    {
        int pri,y,age;
        double i;
        Scanner pa=new Scanner(System.in); 
        System.out.println("Enter the principal amt");
        pri=pa.nextInt();
        System.out.println("Enter the no of years");
        y=pa.nextInt();
        System.out.println("Senior citizen:y / n");
        age=pa.nextInt();
        if(age=='y')
        {
            i=(pri*y*0.12)/100;
            System.out.println(i);

        }
        else
        {
            i=(pri*y*0.10)/100;
            System.out.println(i);
        }



        
    }
}