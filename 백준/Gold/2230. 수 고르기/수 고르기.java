import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[]arr = new int[N];
        
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = Integer.MAX_VALUE;
        
        for(int i=0; i<N; i++){
            int start = i+1;
            int end = N-1;
            int idx = N;
            
            while(start <= end){
                int mid = (start + end)/2;
                int diff = arr[mid]-arr[i];
                
                if(diff >= M){
                    idx = mid;
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            if(idx < N){
                answer = Math.min(answer,arr[idx] - arr[i]);
                if(answer == M){
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}