import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[]supo1 = {1,2,3,4,5};
        int[]supo2 = {2,1,2,3,2,4,2,5};
        int[]supo3 = {3,3,1,1,2,2,4,4,5,5};
        
        int score1 = 0, score2 = 0, score3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == supo1[i % supo1.length]) score1++;
            if(answers[i] == supo2[i % supo2.length]) score2++;
            if(answers[i] == supo3[i % supo3.length]) score3++;
        }
        
        int max = Math.max(score1,Math.max(score2,score3));
        
        List<Integer>list = new ArrayList<>();
        if(score1 == max) list.add(1);
        if(score2 == max) list.add(2);
        if(score3 == max) list.add(3);
        
        int[]answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}