import java.util.*;
public class FibnociOfN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        int start=1,first=0;
        int sum=0;
      sc.close();
        for(int i=0;i<num;i++)
        {  
            while (i<num) {
        
            sum+=first+start;
            start=sum;
        }
        System.out.println(sum);
    }
       
    }

}