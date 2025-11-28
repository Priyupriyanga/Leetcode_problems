
import java.util.*;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
sc.close();
        char[] s$ = str1.toCharArray();
        char[] j$ = str2.toCharArray();

        Arrays.sort(s$);
        Arrays.sort(j$);
boolean res = CallPannuDa(s$,j$);
        System.out.println(res);

    }
    public static boolean CallPannuDa(char[] s,char[] j) {
        
        int i=0;
        boolean st=true;
        while(i<s.length)
        {
            if(s[i]==j[i]){
            i++;
            st=true;
        }
            else{
          return false;
            }
          
        }
        
    


       return st;
    }
}
