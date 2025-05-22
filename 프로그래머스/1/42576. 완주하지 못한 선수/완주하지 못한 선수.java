import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<participant.length; i++){
            String name = participant[i];
            if(map.get(name) == null){
                map.put(participant[i],1);
            }else{
                int count = map.get(name);
                map.put(name,count+1);
            }
            
        }
        for(int i=0; i<completion.length; i++){
            String name = completion[i];
            int count = map.get(name);
            map.put(name,count-1);
        }
        Object [] keys = map.keySet().toArray();
        for(int i=0; i<keys.length; i++){
            String key = (String)keys[i];
            if(map.get(key) != 0){
                return key;
            }
        }
        return "";
    }
}