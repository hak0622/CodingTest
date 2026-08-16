import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[]str = s.split(" ");
        List<Integer>list = new ArrayList<>();
        
        for(int i=0; i<str.length; i++){
            list.add(Integer.parseInt(str[i]));
        }
        
        Collections.sort(list);
        
        sb.append(list.get(0));
        sb.append(" ");
        sb.append(list.get(list.size()-1));
        return sb.toString();
    }
}