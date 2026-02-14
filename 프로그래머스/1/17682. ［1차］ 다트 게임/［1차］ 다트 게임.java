class Solution {
    public int solution(String dartResult) {
        int[]scores = new int[3];
        int idx = -1;
        String tempNum = "";
        
        for(int i=0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);
            
            if(Character.isDigit(c)){
                tempNum = tempNum + c;
            }else if(c == 'S' || c=='D' || c=='T'){
                idx++;
                int score = Integer.parseInt(tempNum);
                
                if(c == 'S'){
                    scores[idx] = score;
                }else if(c == 'D'){
                    scores[idx] = score * score;
                }else if(c == 'T'){
                    scores[idx] = score * score * score;
                }
                tempNum = "";
            }else if(c == '*'){
                scores[idx] = scores[idx] * 2;
                if(idx > 0){
                    scores[idx - 1] = scores[idx - 1] * 2;
                }
            }else if(c == '#'){
                scores[idx] = scores[idx] * -1;
            }
        }
        
        return scores[0] + scores[1] + scores[2];
    }
}