import java.util.Scanner;
public class MattMul
{
    public static void main(String args[])
    {
        int mat1[][]={{1,2},{5,3}};
        int mat2[][]={{2,3},{4,1}};
        int mat3[][]=new int[2][2];
        int i,j,k;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                mat3[i][j]=0;
                for(k=0;k<2;k++)
                {
                mat3[i][j]=mat3[i][j]+(mat1[i][k]*mat2[k][j]);
            }
            System.out.println(mat3[i][j]+"\t");
        }
         System.out.println();
        }
    }
}