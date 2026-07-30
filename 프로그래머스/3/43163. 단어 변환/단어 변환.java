import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Queue<Integer>q = new LinkedList<>();
        Queue<String>s = new LinkedList<>();
        boolean[]visited = new boolean[words.length];
        
        q.add(0);
        s.add(begin);
        
        while(!q.isEmpty()){
            String cur = s.poll();
            int step = q.poll();
            
            if(cur.equals(target)) return step;
            
            for(int i=0; i<words.length; i++){
                if(!visited[i] && diff(cur, words[i])){
                    visited[i] = true;
                    s.add(words[i]);
                    q.add(step + 1);
                }
            }
        }
        
        return answer;
    }
    
    public boolean diff(String a, String b){
        int count = 0;
        
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != b.charAt(i)) count++;
        }
        
        return count == 1;
    }
}