class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i=1; i<=count; i++){
            answer = answer + price * i;
        }
        
        if(answer > money){
            answer = answer - money;
        }else{
            return 0;
        }
        return answer;
    }
}