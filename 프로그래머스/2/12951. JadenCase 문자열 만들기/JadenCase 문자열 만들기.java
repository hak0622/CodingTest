class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(Character.isLetter(c)){
                if(idx == 0){
                    sb.append(Character.toUpperCase(c));
                    idx++;
                }else{
                    sb.append(Character.toLowerCase(c));
                    idx++;
                }
            }else if(Character.isDigit(c)){
                sb.append(c);
                idx++;
            }else{
                sb.append(" ");
                idx = 0;
            }
        }
        
        return sb.toString();
    }
}