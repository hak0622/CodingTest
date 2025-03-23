import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next(); //알바펫 입력 받기
        int B = sc.nextInt(); //진법을 입력받는다.
        int tmp = 1;
        int result =0;

        for(int i=N.length()-1; i>=0; i--){
            char c = N.charAt(i);
            if(c>='A' && c<='Z'){
                result = result + (c-55) *tmp;
            }else{
                result = result + (c-48) *tmp;
            }
            tmp = tmp *B;
        }
        System.out.println(result);
    }
}
