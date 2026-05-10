import java.util.*;

class Solution {
    HashSet<Integer>set = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
        dfs("", numbers);
        
        for(int num : set){
            if(isPrime(num)) answer++;
        }
        
        return answer;
    }
    
    public void dfs(String comb, String others){
        if(!comb.equals("")) set.add(Integer.parseInt(comb));
        
        for(int i=0; i<others.length(); i++){
            dfs(comb + others.charAt(i), others.substring(0,i) + others.substring(i+1));
        }
    }
    
    public boolean isPrime(int n){
        if(n < 2) return false;
        
        for(int i=2; i*i <= n; i++){
            if(n % i == 0) return false;
        }
        
        return true;
    }
}