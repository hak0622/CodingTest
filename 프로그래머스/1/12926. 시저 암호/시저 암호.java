class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == ' ') sb.append(" ");
            else if(c>='A' && c<='Z'){
                char move = (char)(((c-'A')+n) % 26 + 'A');
                sb.append(move);
            }else if(c>='a' && c<='z'){
                char move = (char)(((c-'a')+n) % 26 + 'a');
                sb.append(move);
            }
        }
        return sb.toString();
    }
}