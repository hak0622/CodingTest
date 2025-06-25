import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] split = myString.split("x");
        ArrayList<String>list = new ArrayList<>();
        
        for(int i=0; i<split.length; i++){
            if(!split[i].equals("")){
                list.add(split[i]);
            }
        }
        
        String[]answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}