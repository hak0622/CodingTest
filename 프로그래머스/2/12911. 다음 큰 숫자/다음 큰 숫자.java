class Solution {
    public int solution(int n) {
        String s1 = Integer.toString(n, 2);
        int s1Count = 0;
        int nextNum = n;
        int answer = 0;
        
        for(int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            if(c == '1') s1Count++;
        }
        
        while(true){
            nextNum++;
            String s2 = Integer.toString(nextNum, 2);
            int s2Count = 0;
            
            for(int i=0; i<s2.length(); i++){
                if(s2.charAt(i) == '1') s2Count++;
            }
            if(s1Count == s2Count) return nextNum;
        }
    }
}