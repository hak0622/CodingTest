import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[]answer = new int[3];
        int[]supo1 = new int[]{1,2,3,4,5};
        int[]supo2 = new int[]{2,1,2,3,2,4,2,5};
        int[]supo3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == supo1[i % supo1.length]) count1++;
            if(answers[i] == supo2[i % supo2.length]) count2++;
            if(answers[i] == supo3[i % supo3.length]) count3++;
        }
        
        int maxCount = Math.max(count1, Math.max(count2, count3));
        
        List<Integer>list = new ArrayList<>();
        if(maxCount == count1) list.add(1);
        if(maxCount == count2) list.add(2);
        if(maxCount == count3) list.add(3);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}