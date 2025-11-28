import java.util.Arrays;
import java.util.Scanner;

 public class Array{
 public static void main(String[] args) {
    
   Scanner sc = new Scanner(System.in);
   System.out.print("enter the range:");
   int range=sc.nextInt();
   System.out.print("enter the array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        sc.close();

        Arrays.sort(arr);

  for(int i=0;i<n;i++){
    while(range>0){
    if(arr[i]!=range)

           { 
            System.out.print(range+ ",");
           range--;
           }
      
            }
        }
        
       

}
 }
