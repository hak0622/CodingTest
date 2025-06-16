class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for(int i=0; i<control.length(); i++){
            char c = control.charAt(i);
            if(c =='w'){
                answer = answer + 1;
            }else if(c == 's'){
                answer = answer - 1;
            }else if(c == 'd'){
                answer = answer + 10;
            }else{
                answer = answer - 10;
            }
        }
        return answer;
    }
}