
import java.util.Scanner;


public class HourGlass{
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter the row and col :");
int row =sc.nextInt();
int col =sc.nextInt();
sc.close();
int sum=0;
int matrix[][] = new int[row][col];
int max=0;

for(int i=0;i<row;i++)
{
    
    for(int j=0;j<col;j++)
    {
        matrix[i][j]=sc.nextInt();
    }
}

for(int i=0;i<row-2;i++)
{
    max=0;
    for(int j=0;j<col-2;j++)
    {
        sum =matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j+1]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];  
        }
        if(sum>max)
        max=sum;
}
System.out.println(sum);       
}

}