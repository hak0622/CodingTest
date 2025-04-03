class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String str = s.toLowerCase();
        int p = 0;
        int y = 0;
        for(int i=0; i<s.length(); i++){
            char c = str.charAt(i);
            if(c=='p'){
                p+=1;
            }else if(c=='y'){
                y+=1;
            }
        }
        if(p!=y){
            answer=false;
        }
        return answer;
    }
}