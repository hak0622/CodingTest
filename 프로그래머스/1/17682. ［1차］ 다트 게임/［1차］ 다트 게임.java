class Solution {
    public int solution(String dartResult) {
        int[]scores = new int[3];
        int idx = 0;
        int i = 0;
        
        while(i < dartResult.length()){
            int score;
            if(i+1<dartResult.length() && dartResult.charAt(i)=='1' && dartResult.charAt(i+1)=='0'){
                score = 10;
                i = i + 2;
            }else{
                score = dartResult.charAt(i) - '0';
                i++;
            }
            
            char bonus = dartResult.charAt(i);
            i++;
            
            if(bonus == 's'){
                score = score;
            }else if(bonus == 'D'){
                score = score * score;
            }else if(bonus == 'T'){
                score = score * score * score;
            }
            
            if(i < dartResult.length()){
                char option = dartResult.charAt(i);
                
                if(option == '*'){
                    score = score * 2;
                    if(idx > 0){
                        scores[idx - 1] = scores[idx -1] * 2;
                    }
                    i++;
                }else if(option == '#'){
                    score = score * -1;
                    i++;
                }
            }
            
            scores[idx] = score;
            idx++;
        }
        int answer = 0;
        for(int s : scores){
            answer = answer + s;
        }
        
        return answer;
    }
}