class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean blank = true;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == ' '){
                sb.append(" ");
                blank = true;
                continue;
            }else if(blank){
                sb.append(Character.toUpperCase(c));
                blank = false;
            }else{
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}