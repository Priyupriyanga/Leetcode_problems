import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class majelements {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int[] arr = new int[num];
        int count=0;
        int element=0;
        for(int i=0;i<num;i++)
        {
arr[i]=sc.nextInt();
        }
        sc.close();

HashMap<Integer,Integer> cmap =new HashMap<>();
for(int n :arr){
    cmap.put(n,cmap.getOrDefault(n,0) + 1);
}
for(Map.Entry<Integer,Integer> enter:cmap.entrySet()){
   if (enter.getValue() >count)
   {
    count=enter.getValue();
    element=enter.getKey();
   }
}
System.out.println(element);
isHappy(element);
}
 public static boolean isHappy(int n) {
         int sum=0,rem=0;
         if(n<9)return false;
        while(n>9)
        {
            if(n!=0){
                 rem = n % 10 ;
                 sum = sum + rem * rem ;
                n = n / 10;
            }
            n = sum;
        } 
        if(n==1)return true;

        return false;
    }
}

