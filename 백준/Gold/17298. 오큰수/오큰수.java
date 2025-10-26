import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]A = new int[N];
        int[]result = new int[N];
        Stack<Integer>st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            while(!st.isEmpty() && A[st.peek()] < A[i]){
                result[st.pop()] = A[i];
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            result[st.pop()] = -1;
        }

        for(int i=0; i<N; i++){
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}