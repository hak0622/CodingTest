import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[]math1 = {1,2,3,4,5};
        int[]math2 = {2,1,2,3,2,4,2,5};
        int[]math3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[]count = new int[3];
        List<Integer>list = new ArrayList<>();
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == math1[i % math1.length]) count[0]++;
            if(answers[i] == math2[i % math2.length]) count[1]++;
            if(answers[i] == math3[i % math3.length]) count[2]++;
        }
        
        int max = Math.max(count[0], Math.max(count[1],count[2]));
        
        for(int i=0; i<count.length; i++){
            if(count[i] == max) list.add(i+1);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}