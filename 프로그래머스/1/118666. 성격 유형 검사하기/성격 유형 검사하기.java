import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character,Integer>score = new HashMap<>();
        
        char[]all = {'R','T','C','F','J','M','A','N'};
        for(char c : all){
            score.put(c,0);
        }
        
        for(int i=0; i<survey.length; i++){
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            int choice = choices[i];
            
            if(choice < 4){
                int point = 4 - choice;
                score.put(left,score.get(left) + point);
            }else if(choice > 4){
                int point = choice - 4;
                score.put(right,score.get(right)+point);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(pick(score, 'R','T'));
        sb.append(pick(score, 'C', 'F'));
        sb.append(pick(score, 'J', 'M'));
        sb.append(pick(score, 'A', 'N'));
        
        return sb.toString();
    }
    
    private char pick(Map<Character,Integer>score, char left, char right){
        if(score.get(left) >= score.get(right)){
            return left;
        }
        return right;
    }
}