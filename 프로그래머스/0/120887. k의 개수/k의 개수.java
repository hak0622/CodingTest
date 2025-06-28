class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kstr = Integer.toString(k);
        
        for(int start=i; start<=j; start++){
            String str = Integer.toString(start);
            
            if(str.contains(kstr)){
                String[]arr = str.split("");
                
                for(String arrSplit : arr){
                    if(arrSplit.equals(kstr)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}