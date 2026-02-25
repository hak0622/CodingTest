import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[]supo1 = {1,2,3,4,5};
        int[]supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[]supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == supo1[i % supo1.length]){
                cnt1++;
            }
            if(answers[i] == supo2[i % supo2.length]){
                cnt2++;
            }
            if(answers[i] == supo3[i % supo3.length]){
                cnt3++;
            }
        }
        
        List<Integer>list = new ArrayList<>();
        int max = Math.max(cnt1, Math.max(cnt2,cnt3));
        
        if(max == cnt1) list.add(1);
        if(max == cnt2) list.add(2);
        if(max == cnt3) list.add(3);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}