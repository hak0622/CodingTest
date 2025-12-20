class Solution {
    public String solution(String s, int n) {
        char[]ch = s.toCharArray();
        
        for(int i=0; i<ch.length; i++){
            if(ch[i] == ' '){
                continue;
            }
            
            if(ch[i] >='A' && ch[i]<='Z'){
                ch[i] = (char)(ch[i] + n);
                if(ch[i] > 'Z'){
                   ch[i] = (char)(ch[i] - 26);
                }
            }else if(ch[i] >='a' && ch[i]<='z'){
                ch[i] = (char)(ch[i] + n);
                if(ch[i] > 'z'){
                   ch[i] = (char)(ch[i] - 26);
                }
            }
        }
        return new String(ch);
    }
}