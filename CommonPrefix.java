import java.util.*;
public class CommonPrefix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        
        String[] str=new String[n];//{"flower","flow","floor","flood"};
for(int j =0;j<n;j++)
{
    str[j]=sc.next();
}
String res = longestCommonPrefix(str);
System.out.println(res);
sc.close();
    }
public static String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    int len=strs.length-1;
    String str1 =strs[0];
   String prefix="";
    int i=0;
    while(i<str1.length())
    {
        if(str1.charAt(i)==(strs[len].charAt(i))){
        prefix = prefix + (str1.charAt(i));
        i++;
        }
        else
        break;
       
    }
    return prefix;
}
    }
