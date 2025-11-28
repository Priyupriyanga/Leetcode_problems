import java.util.Arrays;
import java.util.Scanner;
public class ArraysortwithINT {
 
        public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             String pat =sc.next();
             int st = sc.nextInt();
             sc.close();
            /* char[] arr =pat.toCharArray();
            String str = sc.next();
            String[] str1 =str.split(" "); */
            char[] arr =pat.toCharArray();
            Arrays.sort(arr);
    
           
            if(st==1)
            {
                for(int i=0;i<arr.length;i++)
                {
                    System.out.print(arr[i]);
                }
            }
            else{
                int len=arr.length-1;
                char temp;
                for(int i=0;i<(arr.length)/2;i++)
                {
                   
                   temp = arr[i];
                   arr[i]=arr[len-i];
                   arr[len-i]=temp;
                }
                for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]);
            }
        }
    }
    

