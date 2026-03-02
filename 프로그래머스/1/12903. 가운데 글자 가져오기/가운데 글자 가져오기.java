class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 != 0){
            int n = s.length() / 2;
            answer = s.substring(n,n+1);
        }else{
            int n = s.length() / 2;
            answer = s.substring(n-1,n+1);
        }
        
        return answer;
    }
}