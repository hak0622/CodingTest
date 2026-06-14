import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int front = 0;
        int end = people.length - 1;
        
        while(front <= end){
            if(people[front] + people[end] <= limit) front++;
            
            answer++;
            end--;
        }
        return answer;
    }
}