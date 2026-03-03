class Solution {
    public int[] solution(String s) {
        int sum = 0;
        int count = 0;
        
        while(s.length() != 1){            
            int deleteOne = 0;
            
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                
                if(c == '0'){
                    deleteOne++;
                }
            }
            
            sum = sum + deleteOne;
            count = count + 1;
            
            s = Integer.toString(s.length() - deleteOne , 2);            
        }
        
        return new int[]{count,sum};
    }
}