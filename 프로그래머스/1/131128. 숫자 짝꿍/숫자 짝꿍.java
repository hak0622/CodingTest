class Solution {
    public String solution(String X, String Y) {
        int[]countX = new int[10];
        int[]countY = new int[10];
        StringBuilder sb = new StringBuilder();
        
        for(char c : X.toCharArray()){
            countX[c - '0']++;
        }
        for(char c : Y.toCharArray()){
            countY[c - '0']++;
        }
        for(int i=9; i>=0; i--){
            int common = Math.min(countX[i],countY[i]);
            
            for(int j=0; j<common; j++){
                sb.append(i);
            }
        }
        
        String answer = sb.toString();
        if(answer.isEmpty()){
            return "-1";
        }else if(answer.charAt(0) == '0'){
            return "0";
        }
        
        return answer;
    }
}