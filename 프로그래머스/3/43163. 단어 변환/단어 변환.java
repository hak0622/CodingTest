import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[]visited = new boolean[words.length];
        
        Queue<String>q = new LinkedList<>();
        Queue<Integer>steps = new LinkedList<>();
        
        q.offer(begin);
        steps.offer(0);
        
        while(!q.isEmpty()){
            String cur = q.poll();
            int step = steps.poll();
            
            if(cur.equals(target)) return step;
            
            for(int i=0; i<words.length; i++){
                if(!visited[i] && move(cur,words[i])){
                    visited[i] = true;
                    q.offer(words[i]);
                    steps.offer(step + 1);
                }
            }
        }
        return 0;
    }
    
    public boolean move(String a, String b){
        int diff = 0;
        
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                diff++;
            }
        }
        return diff == 1;
    }
}