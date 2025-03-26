import java.util.*;

class Solution {
    public String solution(String s) {
        String[]answer = s.split(" ",-1);
        
        
        for(int i=0; i<answer.length; i++){
            String esang="";
            for(int j=0; j<answer[i].length(); j++){
                char ch = answer[i].charAt(j);
                if(j%2==0){
                    esang+=Character.toUpperCase(ch);
                }else{
                    esang+=Character.toLowerCase(ch);
                }
            }
            answer[i]=esang;
        }
        return String.join(" ", answer); 
    }
}