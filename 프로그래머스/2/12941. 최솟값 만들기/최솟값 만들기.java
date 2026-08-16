import java.util.*;

class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        int indexB = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=A.length-1; i>=0; i--){
            answer = answer + A[i] * B[indexB++];
        }
        
        return answer;
    }
}