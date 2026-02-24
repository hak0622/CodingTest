class Solution {
    public int solution(int n) {
        int curOne = 0;
        int answer = 0;
        
        String curN = Integer.toString(n,2);
        
        for(int i=0; i < curN.length(); i++){
            char c = curN.charAt(i);
            
            if(c == '1'){
                curOne++;
            }
        }
        
        while(true){
            n = n + 1;
            int nextOne = 0;
            String nextN = Integer.toString(n,2);
            
            for(int i=0; i<nextN.length(); i++){
                char c = nextN.charAt(i);
                
                if(c == '1'){
                    nextOne++;
                }
            }
            
            if(curOne == nextOne){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}