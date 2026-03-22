import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int[]>stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=N; i++){
            int height = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty() && stack.peek()[1] < height){
                stack.pop();
            }

            if(stack.isEmpty()){
                sb.append(0).append(" ");
            }else{
                sb.append(stack.peek()[0]).append(" ");
            }

            stack.push(new int[]{i,height});
        }
        System.out.println(sb);
    }
}