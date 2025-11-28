import java.util.Scanner;

public class RotateArrayByK {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size =sc.nextInt();
        System.out.println("enter the array elements:");
        int arr[] =new int[size];
for(int i=0;i<size;i++)
{
  arr[i]=sc.nextInt();
}
System.out.println("enter rotate count:");
int k=sc.nextInt();
sc.close();

RotateArray(arr,k);
    }
    public static void RotateArray(int[] arr,int k){
int len=arr.length;


for(int j=0;j<k;j++){
int temp=arr[len-1];
for(int i=len-1;i>0;i--)
{
    arr[i]=arr[i-1];
}
arr[0]=temp;
}


//display
for(int i=0;i<len;i++)
{
    System.out.print(arr[i] + " ");
}

    }
}
