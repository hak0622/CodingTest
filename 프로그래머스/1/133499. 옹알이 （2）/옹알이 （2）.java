class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[]can = {"aya","ye","woo","ma"};
        
        for(String s : babbling){
            boolean isContinue = false;
            
            for(String val : can){
                if(s.contains(val + val)){
                    isContinue = true;
                    break;
                }
            }
            
            if(isContinue) continue;
            
            for(String val : can){
                s = s.replace(val, " ");
            }
            
            if(s.trim().length() == 0){
                answer++;
            }
        }
        return answer;
    }
}