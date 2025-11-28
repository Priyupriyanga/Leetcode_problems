import java.util.*;
public class ClockAnticlockString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
String str1 = sc.next();
String str2 = sc.next();
sc.close();
char[] arr1 = str1.toCharArray();
char[] arr2=str2.toCharArray();
int len=arr1.length;

for(int i=0;i<2;i++)
{
    char temp=arr1[len-1];
    for(int j=arr1.length-1;j>0;j--){
        arr1[j]=arr1[j-1];
    }
    arr1[0]=temp;
}
if(Arrays.equals(arr1,arr2))
{
    System.out.println("true");
}
else
System.out.println("false");

    }
}
