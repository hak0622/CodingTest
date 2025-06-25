import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        LinkedHashSet<String>set = new LinkedHashSet<>();
        String[]arr = my_string.split("");
        
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        answer = String.join("",set);
        return answer;
    }
}