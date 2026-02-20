import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[]visited = new boolean[words.length];
        Queue<String>q = new LinkedList<>();
        Queue<Integer>depthQ = new LinkedList<>();
        
        q.add(begin);
        depthQ.offer(0);
        
        while(!q.isEmpty()){
            String cur = q.poll();
            int depth = depthQ.poll();
            
            if(cur.equals(target)) return depth;
            
            for(int i=0; i<words.length; i++){
                if(!visited[i] && diffOne(cur,words[i])){
                    visited[i] = true;
                    q.add(words[i]);
                    depthQ.add(depth + 1);
                }
            }
        }
        return 0;
    }
    
    boolean diffOne(String a, String b){
        int diff = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                diff++;
            }
        }
        return diff == 1;
    }
}