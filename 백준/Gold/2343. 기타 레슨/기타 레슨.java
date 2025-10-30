import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[]A = new int[N];
        int low = 0;
        int high = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if(low < A[i]){
                low = A[i];
            }
            high = high + A[i];
        }

        while(low <= high){
            int mid = (low + high) / 2;
            int sum = 0;
            int count = 0;

            for(int i=0; i<N; i++){
                if(sum + A[i] > mid){
                    count++;
                    sum = 0;
                }
                sum = sum + A[i];
            }
            if(sum !=0){
                count++;
            }
            if(count > M){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        System.out.println(low);
    }
}