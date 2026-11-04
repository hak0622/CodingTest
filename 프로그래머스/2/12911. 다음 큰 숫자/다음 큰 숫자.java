class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String pre = Integer.toString(n,2);
        int count = 0;
        
        for(int i=0; i<pre.length(); i++){
            char c = pre.charAt(i);
            
            if(c == '1') count++;
        }
        
        while(true){
            n = n + 1;
            String next = Integer.toString(n,2);
            int nextCount = 0;
            
            for(int i=0; i<next.length(); i++){
                char c = next.charAt(i);
                
                if(c == '1') nextCount++;
            }
            
            if(count == nextCount) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}