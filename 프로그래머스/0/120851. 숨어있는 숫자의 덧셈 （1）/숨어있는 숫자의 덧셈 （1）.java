import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String a = my_string.replaceAll("[A-Za-z]",""); //정규표현식 쓸거면 replaceAll
        for(int i=0; i<a.length(); i++){
            char b = a.charAt(i);
            answer += Integer.parseInt(String.valueOf(b));
        }
        return answer;
    }
}