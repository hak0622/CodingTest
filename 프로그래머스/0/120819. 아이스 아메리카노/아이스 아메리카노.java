class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int count = money/5500;
        int namugi = money-(5500*count);
        answer[0]=count;
        answer[1]=namugi;
        return answer;
    }
}