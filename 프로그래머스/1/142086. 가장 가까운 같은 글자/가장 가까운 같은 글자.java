class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=s.length()-1; i>=0; i--){
            int count = 1;
            boolean found = false;
            
            for(int j=i-1; j>=0; j--){
                if(s.charAt(i) == s.charAt(j)){
                    answer[i] = count;
                    found = true;
                    break;
                }
                count++;
            }
            
            if(!found){
                answer[i] = -1;
            }
        }
        return answer;
    }
}