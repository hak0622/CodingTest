import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer>set = new HashSet<>();
        int n = elements.length;
        
        int[]extend = new int[n*2];
        
        for(int i=0; i<n; i++){
            extend[i] = extend[i+n] = elements[i];
        }
        
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<i+n; j++){
                sum = sum + extend[j];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}