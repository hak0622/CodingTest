import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int min = Math.abs(array[0] - n); 
        int index = 0;
        
        for(int i=1; i<array.length; i++){
            int minus = Math.abs(array[i] - n);
            if(minus < min){
                min = minus;
                index = i;
            }else if(minus == min && array[i] < array[index]){
                index = i;
            }
        }
        
        
        return array[index];
    }
}