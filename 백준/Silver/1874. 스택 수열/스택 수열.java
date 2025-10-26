import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]target = new int[n];
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int cur = 1;

        for(int i=0; i<n; i++){
            target[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            int want = target[i];

            while(cur <= want){
                st.push(cur);
                sb.append("+\n");
                cur++;
            }

            if(!st.isEmpty() && st.peek() == want){
                st.pop();
                sb.append("-\n");
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb.toString());
    }
}