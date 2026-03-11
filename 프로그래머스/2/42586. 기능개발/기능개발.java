import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer>st = new Stack<>();
        List<Integer>list = new ArrayList<>();
        int answer = 0;
        
        for(int i=0; i<progresses.length; i++){
            int n = (int)Math.ceil((100 - (double)progresses[i]) / (double)speeds[i]);
            System.out.println("계산 후 = " + n);
            
            if(st.isEmpty()){
                answer++;
                st.push(n);
                System.out.println("answer = " + answer + " 비었었던 스택 = " + st);
            }else if(st.peek() >= n){
                answer++;
                System.out.println("answer = " + answer + " peek 후 스택 = " + st);
            }else if(st.peek() < n){
                st.pop();
                list.add(answer);
                answer = 1;
                st.push(n);
                System.out.println("answer = " + answer + " pop 후 스택 = " + st);
            }
        }
        
        if(answer != 0){
            list.add(answer);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}