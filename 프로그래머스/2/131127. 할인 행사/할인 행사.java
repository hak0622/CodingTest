import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String,Integer>buy = new HashMap<>();
        
        
        for(int i=0; i<want.length; i++){
            buy.put(want[i],number[i]);
        }
        
        for(int i=0; i<=discount.length - 10; i++){
            HashMap<String,Integer>sale = new HashMap<>();
            
            for(int j=i; j<i+10; j++){
                sale.put(discount[j], sale.getOrDefault(discount[j],0)+1);
            }
            
            if(buy.equals(sale)) {
                answer++;
            }
        }
        
        return answer;
    }
}