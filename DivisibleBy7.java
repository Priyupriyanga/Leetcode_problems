import java.util.Scanner;
public class DivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        sc.close();
        while(num>9) {
            int sum=0;
            while(num!=0)
            {
                int rem=num%10;
                num=num/10;
            }
            System.out.println(num);
        }
    }
}
