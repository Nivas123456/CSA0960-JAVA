import java.util.Scanner;
public class MattAdd
{
    public static void main(String args[])
    {
        int mat1[][]={{1,2},{5,3}};
        int mat2[][]={{2,3},{4,1}};
        int mat3[][]=new int[2][2];
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                mat3[i][j]=mat1[i][j]+mat2[i][j];
                System.out.println(mat3[i][j]);
            }
            System.out.println();
        }
    }
}