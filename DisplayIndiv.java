import java.util.Scanner;

public class DisplayIndiv {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System .in);
        System.out.println("Enter");
       int num = sc.nextInt();
        sc.close();
int rem,sum;
/* 
*print sum of digits until it get single digit
while(num>9){
    sum=0;
        while(num!=0)
        {
            rem =num % 10;
            sum += rem;
            num =num/10;  
        }
        num=sum;

    }

    System.out.println(num);*/
     
    while(num!=1){
        sum=0;
            while(num!=0)
            {
                rem =num % 10;
                sum += rem * rem;
                num =num/10;  
            }
            num=sum;
    
        }
    if(num==1)
        System.out.println("happy number");      
     

     else{
     System.out.println(" not happy number");}

 }   
}

