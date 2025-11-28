import java.util.*;
public class ScoreString {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        String str="cdbcbbaaabab";
        int x=4,y=5;
        int res=callSacore(str,x,y);
        System.out.println(res);
    }
    public static int callSacore(String st, int x, int y) {
        int score=0;
        st.toLowerCase();
StringBuilder str = new StringBuilder(st);
int ind=0;
            while((ind=str.indexOf("ba"))!=-1)
            {
                str.delete(ind,ind+2);
                score = score + x;
                }
            while((ind=str.indexOf("ab"))!=-1)
            {
              str.delete(ind,ind+2);
                score = score+ y;
            }
        return score;
    }
}

