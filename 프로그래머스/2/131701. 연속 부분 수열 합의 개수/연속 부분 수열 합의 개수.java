import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer>set = new HashSet<>();
        int n = elements.length;
        int[]extend = new int[n*2];
        
        for(int i=0; i<n*2; i++){
            extend[i] = elements[i % n];
        }
        
        for(int i=0; i<n; i++){
            int sum = 0;
            
            for(int j=0; j<n; j++){
                sum = sum + extend[i + j];
                set.add(sum);
            }
        }
        return set.size();
    }
}