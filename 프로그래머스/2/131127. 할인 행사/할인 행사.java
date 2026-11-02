import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String,Integer>buy = new HashMap<>();
        HashMap<String,Integer>sale = new HashMap<>();
        
        for(int i=0; i<want.length; i++){
            buy.put(want[i],number[i]);
        }
        
        for(int i=0; i<10; i++){
            sale.put(discount[i],sale.getOrDefault(discount[i],0)+1);
        }
        
        if(buy.equals(sale)) answer++;
        
        for(int i=10; i<discount.length; i++){
            String remove = discount[i-10];
            sale.put(remove, sale.get(remove)-1);
            
            if(sale.get(remove) == 0) sale.remove(remove);
            
            String add = discount[i];
            sale.put(add,sale.getOrDefault(add,0)+1);
            
            if(buy.equals(sale)) answer++;
        }
        
        return answer;
    }
}