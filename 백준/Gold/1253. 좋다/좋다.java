import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int count = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        for(int k=0; k<N; k++){
            int i = 0;
            int j = N-1;

            while(i < j){
                if(i == k) {
                    i++;
                    continue;
                }
                if(j == k){
                    j--;
                    continue;
                }

                int sum = A[i] + A[j];

                if(sum == A[k]){
                    count++;
                    break;
                }else if(sum > A[k]){
                    j--;
                }else{
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}