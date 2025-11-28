import java.util.Scanner;
//import java.io.*;
public class primenum {
    public static void main(String[] args)
    {
        int num;
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        int i;
        sc.close();

        for(i=1;i<num;i++)
        {
if(isprime(i))
System.out.print(i + ",");
        }
       

    }
public static boolean isprime(int i)
    {
if(i<=1)return false;

for(int j=2;j<i;j++)
{
    if(i%j==0)return false;
}
return true;

    }
}
