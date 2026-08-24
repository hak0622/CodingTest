import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String>cache = new ArrayList<>();
                
        for(int i=0; i<cities.length; i++){
            String city = cities[i].toUpperCase();
            
            if(cache.contains(city)){
                cache.remove(city);
                cache.add(city);
                answer = answer + 1;
                continue;
            }else{
                cache.add(city);
                answer = answer + 5;
                
                if(cache.size() > cacheSize){
                    cache.remove(0);
                }
            }
        }
        return answer;
    }
}