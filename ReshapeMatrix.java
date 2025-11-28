import java.util.Scanner;
public class ReshapeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and cols:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        
        int[][] mat =new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the matrix to be:");
        int rres=sc.nextInt();
        int cres=sc.nextInt();
       int[][] res = matrixReshape(mat,rres,cres);
       for(int i=0;i<res.length;i++)
       {
           for(int j=0;j<res[0].length;j++){
       System.out.print(res[i][j]+" ");
    }
    System.out.println();

           }
       
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res=new int[r][c];
        int totele = mat.length * mat[0].length;
        if(totele !=r*c || totele%r!=0)return mat;
        int k=0,l=0;
         for(int i=0;i<mat.length;i++)
         {
             for(int j=0;j<mat[0].length;j++)
             {
                
                 res[k][l]=mat[i][j];
                 l++;
                 if(l==c)
                 {
                l=0;
                 k++;
                 }
 
             }
         }
         return res;
     }
}
