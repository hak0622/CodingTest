class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == ' '){
                sb.append(' ');
                continue;
            }
            
            if(c >= 'a' && c <= 'z'){
                char shift1 = (char)((c - 'a' + n) % 26 + 'a');
                sb.append(shift1);
            }else if(c >= 'A' && c <= 'Z'){
                char shift2 = (char)((c - 'A' + n) % 26 + 'A');
                sb.append(shift2);
            }
        }
        
        return sb.toString();
    }
}