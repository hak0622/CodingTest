class Solution {
    public int solution(int n) {
        int answer = 0;
        int count1 = 0;
        
        String s1 = Integer.toString(n,2);
        
        for(int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            
            if(c == '1'){
                count1++;
            }
        }

        while(true){
            int count2 = 0;
            n = n + 1;
            String s2 = Integer.toString(n,2);
            
            for(int i=0; i<s2.length(); i++){
                char c = s2.charAt(i);
                
                if(c == '1'){
                    count2++;
                }
            }
            
            if(count1 == count2){
                answer = n;
                break;
            }
        }
        return answer;
    }
}