import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //개수 입력 변수
        int cnt=0; //소수 개수 카운트 변수
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            cnt += divide(num);
        }
        System.out.println(cnt);
    }

    public static int divide(int num){
        int count=0;

        if(num==0 ||num==1){
            return 0;
        }
        for(int i=2; i<=num; i++){
            if(num%i==0){
               count++;
            }
        }
        if(count==1){
            return 1;
        }else{
            return 0;
        }
    }
}
