import java.util.Scanner;

public class KlaAgency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter the option\n1.electric kettal\n2.induction stove.");
        int choice = sc.nextInt();
        System.out.println("Enter the units");
        int unit = sc.nextInt();
        sc.close();
        long amount=0;
        if(choice==1)
        {
            if(unit>0 && unit<11)
            {
                amount = unit * 950;
            }
            else if(unit>10 && unit < 21)
            {amount =unit * 900;
            }
            else {
                amount = unit * 850;
            }

        }
        else {
            if(unit>0 && unit<16)
            {
                amount = unit * 1100;
            }
            else if(unit>15 && unit < 26)
            {amount =unit * 1000;
            }
            else {
                amount = unit * 975;
            }

        }
        System.out.println("Amount:" + amount);
    }
}
