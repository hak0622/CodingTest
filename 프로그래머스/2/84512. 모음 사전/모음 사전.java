class Solution {
    int answer = 0;
    int count = 0;
    char[]c = {'A','E','I','O','U'};
    
    public int solution(String word) {
        dfs("", word);
        return answer;
    }
    
    public void dfs(String s, String target){
        if(s.equals(target)){
            answer = count;
            return;
        }
        
        if(s.length() >= 5) return;
        
        for(int i=0; i<c.length; i++){
            count++;
            dfs(s + c[i], target);
        }
    }
}