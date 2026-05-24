import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<Integer>depth = new LinkedList<>();
        Queue<String>q = new LinkedList<>();
        boolean[]visited = new boolean[words.length];
        
        q.add(begin);
        depth.add(0);
        
        while(!q.isEmpty()){
            String cur = q.poll();
            int step = depth.poll();
            
            if(cur.equals(target)) return step;
            
            for(int i=0; i<words.length; i++){
                if(!visited[i] && check(cur, words[i])){
                    visited[i] = true;
                    q.add(words[i]);
                    depth.add(step + 1);
                }
            }
        }
        return 0;
    }
    
    public boolean check(String a, String b){
        int diff = 0;
        
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != b.charAt(i)) diff++;
        }
        
        return diff == 1;
    }
}