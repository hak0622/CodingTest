import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String,String>map = new HashMap<>();
        ArrayList<String>list = new ArrayList<>();
        
        for(int i=0; i<record.length; i++){
            String[]arr = record[i].split(" ");
            
            if(arr[0].equals("Enter") || arr[0].equals("Change")){
                map.put(arr[1],arr[2]);
            }
        }
        
        for(int i=0; i<record.length; i++){
            String[]arr = record[i].split(" ");
            String name = map.get(arr[1]);
            
            if(arr[0].equals("Enter")){
                list.add(name + "님이 들어왔습니다.");
            }else if(arr[0].equals("Leave")){
                list.add(name + "님이 나갔습니다.");
            }
        }
        
        return list.toArray(new String[0]);
    }
}