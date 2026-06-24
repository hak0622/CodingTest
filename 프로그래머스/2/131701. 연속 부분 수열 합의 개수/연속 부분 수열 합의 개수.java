import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer>set = new HashSet<>();
        int[]copy = new int[elements.length * 2];
        
        for(int i=0; i<elements.length; i++){
            copy[i] = elements[i];
            copy[i + elements.length] = elements[i];
        }
        
        for(int i=0; i<elements.length; i++){
            int sum = 0;
            for(int j=0; j<elements.length; j++){
                sum = sum + copy[i + j];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}