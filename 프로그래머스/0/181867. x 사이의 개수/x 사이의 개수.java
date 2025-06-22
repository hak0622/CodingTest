class Solution {
    public int[] solution(String myString) {
        String[]asd = myString.split("x",-1);
        int[] answer = new int[asd.length];
        for(int i=0; i<asd.length; i++){
            answer[i] = asd[i].length();
        }
        return answer;
    }
}