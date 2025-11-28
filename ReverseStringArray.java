public class ReverseStringArray {
    public static void main(String[] args) {
        char[] str = {'H', 'e', 'l', 'l', 'o'};

        int low=0,high=str.length-1;
while(low<high)
{
    char temp=str[low];
    str[low]=str[high];
    str[high]=temp;
    low++;
    high--;

}
System.out.println(str);
    }
}
