import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String,Integer>termMap = new HashMap<>();
        
        for(String t :terms){
            String[]parts = t.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }
        
        int todayNum = toDay(today);
        
        ArrayList<Integer>result = new ArrayList<>();
        
        for(int i=0; i<privacies.length; i++){
            String[]parts = privacies[i].split(" ");
            String date = parts[0];
            String type = parts[1];
            
            int startDay = toDay(date);
            int month = termMap.get(type);
            
            int expireDay = startDay + month * 28;
            
            if(todayNum >= expireDay){
                result.add(i + 1);
            }
        }
        
        int[]answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
    
    private int toDay(String date){
        String[] d = date.split("\\.");
        int year = Integer.parseInt(d[0]);
        int month = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);
        
        return year * 12 * 28 + month * 28 + day;
    }
}