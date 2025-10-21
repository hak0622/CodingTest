import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int start = 1;
         int end = 1;
         int count = 1;
         int sum = 1;

         while(end != N){
             if(sum == N){ //현재 연속 합이 N과 같은 경우
                 count++;
                 end++;
                 sum = sum + end;
             }else if(sum > N){ //현재 연속 합이 N보다 더 큰 경우
                 sum = sum - start;
                 start++;
             }else{ // 현재 연속 합이 N보다 작은 경우
                 end++;
                 sum = sum + end;
             }
         }
        System.out.println(count);
    }
}