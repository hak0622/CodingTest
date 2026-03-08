import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int start = 0;
        int end = people.length-1;
        
        Arrays.sort(people);
        
        for(int i=end; i>=start; i--){
            int sum = people[i] + people[start];
            
            if(sum <= limit){
                answer++;
                start++;
            }else{
                answer++;
            }
        }
        return answer;
    }
}