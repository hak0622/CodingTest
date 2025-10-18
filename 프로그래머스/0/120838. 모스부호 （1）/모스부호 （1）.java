class Solution {
    public String solution(String letter) {
        String[] morse = { 
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", 
            ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." 
        };
        
        String[] alphabet = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        
        String answer = "";
        String[]words = letter.split(" ");
        
        for(String code : words){
            for(int i=0; i<morse.length; i++){
                if(code.equals(morse[i])){
                    answer += alphabet[i];
                    break;
                }
            }
        }
        return answer;
    }
}