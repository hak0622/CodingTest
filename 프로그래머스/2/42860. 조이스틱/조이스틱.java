class Solution {
    public int solution(String name) {
        int answer = 0;
        int minMove = name.length() - 1;
        
        for(int i=0; i<name.length(); i++){
            char c = name.charAt(i);
            
            answer += Math.min(c - 'A', 'Z' - c + 1);
            
            int nextIdx = i + 1;
            while(nextIdx < name.length() && name.charAt(nextIdx) == 'A'){
                nextIdx++;
            }
            
            minMove = Math.min(minMove, i*2+(name.length() - nextIdx));
            minMove = Math.min(minMove, (name.length() - nextIdx) * 2 + i);
        }
        return answer + minMove;
    }
}