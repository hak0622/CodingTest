import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String,Integer>inMap = new HashMap<>();
        Map<String,Integer>totalMap = new HashMap<>();
        
        for(int i=0; i<records.length; i++){
            String[]arr = records[i].split(" ");
            
            String time = arr[0];
            String car = arr[1];
            String type = arr[2];
            
            String[]t = time.split(":");
            int minutes = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
            
            if(type.equals("IN")){
                inMap.put(car,minutes);
            }else{
                int inTime = inMap.get(car);
                int parkingTime = minutes - inTime;
                
                totalMap.put(car, totalMap.getOrDefault(car,0) + parkingTime);
                
                inMap.remove(car);
            }
        }
        
        for(String car : inMap.keySet()){
            int inTime = inMap.get(car);
            int parkingTime = 1439 - inTime;
            
            totalMap.put(car, totalMap.getOrDefault(car,0) + parkingTime);
        }
        
        List<String>list = new ArrayList<>(totalMap.keySet());
        Collections.sort(list);
        
        int[]answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            String car = list.get(i);
            int totalTime = totalMap.get(car);
            
            if(totalTime <= fees[0]){
                answer[i] = fees[1];
            }else{
                int extraTime = totalTime - fees[0];
                int extraFee = (int)Math.ceil((double)extraTime / fees[2]) * fees[3];
                
                answer[i] = fees[1] + extraFee;
            }
        }
        return answer;
    }
}