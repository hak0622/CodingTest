import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            Stack<Character> st = new Stack<>();
            String s = sc.next();
            boolean isValid = true;

            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='('){
                    st.push('(');
                }else if(s.charAt(j)==')'){
                    if(st.isEmpty()){
                        isValid = false;
                        break;
                    }
                    st.pop();
                }
            }
            if(!st.isEmpty()){
                isValid = false;
            }
            System.out.println(isValid ? "YES" : "NO");
        }
    }
}
