import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String>cache = new ArrayList<>();
        
        for(int i=0; i<cities.length; i++){
            String s = cities[i].toLowerCase();
            
            if(!cache.contains(s)){
                cache.add(s);
                answer = answer + 5;
            }else {
                cache.remove(s);
                cache.add(s);
                answer = answer + 1;
            }
            
            if(cache.size() > cacheSize){
                cache.remove(0);
            }   
        }
        return answer;
    }
}