import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int zero = 0;
        int one = 0;

        if(s.charAt(0) == '0') zero++;
        else one++;

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i + 1)){
                if(s.charAt(i+1) == '0'){
                    zero++;
                }else{
                    one++;
                }
            }
        }
        System.out.println(Math.min(zero,one));
    }
}
