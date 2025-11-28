//import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StringPattern {
    public static void main(String[] args) {
        
         String pattern ="abba";
        String s ="dog cat cat dog";
        String[] str =s.split(" ");
        if(pattern.length() != str.length)
        System.out.println("false");
        
        Map<Character,Integer> cmap= new HashMap<>();
        Map<String,Integer> smap=new HashMap<>();

        for(int i=0;i<pattern.length();i++)
        {
            char fchar=pattern.charAt(i);
            String fword=str[i];

            Integer cindex=cmap.put(fchar,i);
            Integer sindex=smap.put(fword,i);
            if(!Objects.equals(cindex,sindex))
            {
            System.out.println( "false");
            }
        }
       

System.out.println("true");
    }
}
