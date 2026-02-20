import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String,Integer>map = new HashMap<>();
        int count = 1;
        
        for(String[]c : clothes){
            String type = c[1];
            map.put(type, map.getOrDefault(type,0) + 1);
        }
        
        for(int cnt : map.values()){
            count = count * (cnt + 1);
        }
        return count -1;
    }
}