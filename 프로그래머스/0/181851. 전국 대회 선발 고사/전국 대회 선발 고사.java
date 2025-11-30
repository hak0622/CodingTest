import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<int[]>list = new ArrayList<>();
        
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                list.add(new int[]{rank[i],i});
            }
        }
        
        Collections.sort(list,(a,b)->a[0] - b[0]);
        answer = 10000 * list.get(0)[1] + 100 * list.get(1)[1] + list.get(2)[1];

        return answer;
    }
}