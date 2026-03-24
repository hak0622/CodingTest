class Solution {
    String[]vowels = {"A","E","I","O","U"};
    int count = 0;
    int answer = 0;
    boolean found = false;
    
    public int solution(String word) {
        dfs("",word);
        return answer;
    }
    
    public void dfs(String current,String word){
        if(found) return;
        
        if(!current.equals("")){
            count++;
            
            if(current.equals(word)){
                answer = count;
                found = true;
                return;
            }
        }
        
        if(current.length() == 5) return;
        
        for(int i=0; i<vowels.length; i++){
            dfs(current + vowels[i], word);
        }
    }
}