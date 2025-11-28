import java.util.Scanner;
public class RotateMatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix=new int[n][n];
        int[][] mat=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();

            }
        }
        sc.close();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
{
    mat[i][j]=matrix[j][i];
}
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--)
{
    System.out.print(mat[i][j] + " ");
}
System.out.println();

        }


/*System.out.println();
  for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
{
   System.out.print(mat[i][j] + " ");
}
System.out.println();


        }*/
    }
}