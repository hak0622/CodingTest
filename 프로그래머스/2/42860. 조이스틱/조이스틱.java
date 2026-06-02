class Solution {
    public int solution(String name) {
        int alphabetMove = 0;
        int len = name.length();
        int minCursorMove = len - 1; 
        
        for(int i = 0; i < len; i++){
            char c = name.charAt(i);
            
            if(c <= 'N'){
                alphabetMove += c - 'A';
            } else {
                alphabetMove += 'Z' - c + 1;
            }
            
            int next = i + 1;
            while(next < len && name.charAt(next) == 'A') {
                next++;
            }
            
            minCursorMove = Math.min(minCursorMove, i * 2 + len - next);
            minCursorMove = Math.min(minCursorMove, (len - next) * 2 + i);
        }
        
        return alphabetMove + minCursorMove;
    }
}