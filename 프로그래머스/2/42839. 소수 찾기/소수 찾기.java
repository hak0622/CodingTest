import java.util.*;

class Solution {
    HashSet<Integer>set = new HashSet<>();
    
    public int solution(String numbers) {
        boolean[]visited = new boolean[numbers.length()];
        int answer = 0;
        
        dfs("", numbers, visited);
        
        for(int n : set){
            if(isPrime(n)) answer++;
        }
        return answer;
    }
    
    
    public void dfs(String cur, String numbers, boolean[]visited){
        if(!cur.equals("")) set.add(Integer.parseInt(cur));
        
        for(int i=0; i<numbers.length(); i++){
            if(visited[i]) continue;
            
            visited[i] = true;
            dfs(cur + numbers.charAt(i) , numbers, visited);
            visited[i] = false;
        }
    }
    
    public boolean isPrime(int n){
        if(n < 2) return false;
        
        for(int i=2; i*i<= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}