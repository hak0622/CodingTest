class Solution {
    char[]voels = {'A','E','I','O','U'};
    int count = 0;
    int answer = 0;
    
    public int solution(String word) {
        dfs("",word);
        return answer;
    }
    
    public void dfs(String cur, String target){
        if(cur.equals(target)){
            answer = count;
            return;
        }
        
        if(cur.length() >= 5) return;
        
        for(int i=0; i<5; i++){
            count++;
            dfs(cur + voels[i], target);
            if(answer != 0) return;
        }
    }
}