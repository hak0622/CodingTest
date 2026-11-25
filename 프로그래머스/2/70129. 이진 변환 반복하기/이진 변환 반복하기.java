class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zero = 0;
        
        while(s.length() > 1){
            StringBuilder sb = new StringBuilder();
            
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                
                if(c == '1') sb.append(c);
                else zero++;
            }
            
            int n = sb.length();
            
            s = Integer.toString(n,2);
            
            count++;
        }
        return new int[]{count,zero};
    }
}