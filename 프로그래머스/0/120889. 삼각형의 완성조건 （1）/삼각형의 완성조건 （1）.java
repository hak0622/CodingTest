import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if(sides[0]+sides[1]<=sides[2]){
            answer = 2;
        }else{
            answer = 1; 
        }
        return answer;
    }
}