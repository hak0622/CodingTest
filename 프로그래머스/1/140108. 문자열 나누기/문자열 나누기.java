class Solution {
    public int solution(String s) {
        int answer = 0;
        int same = 0;
        int diff = 0;
        char x = ' ';
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(same == 0 && diff == 0){
                x = ch;
            }
            
            if(x == ch){
                same++;
            }else{
                diff++;
            }
            
            if(same == diff){
                answer++;
                same = 0;
                diff = 0;
            }
        }
        
        if(same != 0 || diff != 0){
            answer++;
        }
        return answer;
    }
}