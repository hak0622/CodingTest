import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[]ch = a.toCharArray();
        
        for(int i=0; i<a.length(); i++){
            if(ch[i] >= 'a' && ch[i] <='z'){
                ch[i] = (char)(ch[i] - 32);
            }else{
                ch[i] = (char)(ch[i] + 32);
            }
        }
        System.out.println(new String(ch));
    }
}