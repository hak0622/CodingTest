import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]");
        List<String>list = new ArrayList<>();
        
        for(String s : answer){
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        if(list.isEmpty()){
            list.add("EMPTY");
        }
        return list.toArray(new String[0]);
    }
}