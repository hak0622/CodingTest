import java.util.*;

class Solution {
    public int[] solution(String s) {
        String s1 = s.replace("{","");
        String s2 = s1.replace("}","");
        String[]s3 = s2.split(",");
        
        Map<String,Integer>map = new HashMap<>();
        
        for(int i=0; i<s3.length; i++){
            map.put(s3[i],map.getOrDefault(s3[i],0) + 1);
        }
        
        List<String>list = new ArrayList<>(map.keySet());
        
        Collections.sort(list,(a,b) -> map.get(b) - map.get(a));
        
        return list.stream().mapToInt(Integer::parseInt).toArray();
    }
}