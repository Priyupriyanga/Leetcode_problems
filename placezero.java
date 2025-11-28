import java.util.Scanner;
public class placezero {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
        int arr[]=new int[n];
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
int[] arr1 = placezerofun(arr,n);
for(int j=0;j<n;j++)
{
    System.out.print(arr1[j] +" ");
}
sc.close();
    }
public static int[] placezerofun(int[] arr,int size)
{
    int zeroa[]=new int[size];
    int i=0;
for(int j=0;j<size;j++)
{
    if(arr[j]!=0)
    {
        zeroa[i]=arr[j];
        i++;
    }
}
while(i<size)
{
    zeroa[i]=0;
    i++;
}
return zeroa;
}
}
