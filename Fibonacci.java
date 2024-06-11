import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) 
    {
        Scanner fib=new Scanner(System.in);
        int N;
        System.out.print("Enter the range ");
        N=fib.nextInt();
        int num1 = 0, num2 = 1;
         System.out.print("Fibonacci series: ");
        for (int i = 0; i < N; i++) 
        {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
