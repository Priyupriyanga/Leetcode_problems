import java.util.*;
public class Duplicate11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        Boolean res =callthatmethod(arr,num,k);
        System.out.println(res);
    }
    public static boolean callthatmethod(int[] arr,int n,int k)
    {
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(arr[i]==arr[j] && Math.abs(i-j)<=k)
            {
                return true;
            }
        }
       }
        return false;
    }
}
