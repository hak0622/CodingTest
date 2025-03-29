class Solution {
    public String solution(String s) {
        String answer = "";
        boolean start = true;
        
        for(int i=0; i<s.length(); i++){
           char c = s.charAt(i);
           if(start){
               answer += Character.toUpperCase(c);
           }else{
               if(Character.isDigit(c)){
                   continue;
               }
               answer+=Character.toLowerCase(c);
           }
            start=(c==' ');
                 
        }
        return answer;
    }
}