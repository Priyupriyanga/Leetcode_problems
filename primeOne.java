import java.util.Scanner;

public class primeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter");
        
       int s = sc.nextInt();
       int end = sc.nextInt();
        sc.close();

        for(int i=s;i<end;i++)
        {
            if(ReturnPrim(i))
            {
               while(i%10==1)
                {System.out.print(i + " ");
            break;}
                       }
        }
       

        }
public static boolean ReturnPrim(int n)
{

  if(n==0 || n==1)return false;
  for(int i=2;i<n;i++)
         while(n%i==0)
         {
           return false;
         }

return true;
}


    }
