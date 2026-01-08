class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            String b = babbling[i];
            
            if(b.contains("ayaaya") || b.contains("yeye") || b.contains("woowoo") || b.contains("mama")){
                continue;
            }
            
            b = b.replace("aya", "0");
            b = b.replace("ye", "0");
            b = b.replace("woo", "0");
            b = b.replace("ma", "0");
            
            b = b.replace("0","");
            
            if(b.isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}