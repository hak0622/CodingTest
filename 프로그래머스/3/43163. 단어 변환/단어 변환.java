import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[]visited = new boolean[words.length];
        
        Queue<String>q = new LinkedList<>();
        q.add(begin);
        
        int answer = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0; i<size; i++){
                String cur = q.poll();
                
                if(cur.equals(target)) return answer;
                
                for(int j=0; j<words.length; j++){
                    if(visited[j]) continue;
                    
                    int diff = 0;
                    
                    for(int k=0; k<cur.length(); k++){
                        if(cur.charAt(k) != words[j].charAt(k)){
                            diff++;
                        }
                    }
                    
                    if(diff == 1){
                        visited[j] = true;
                        q.add(words[j]);
                    }
                }
            }
            answer++;
        }
        return 0;
    }
}