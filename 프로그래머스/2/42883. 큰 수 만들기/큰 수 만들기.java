class Solution {
    public String solution(String number, int k) {
        String ans = "";
        
        for(int i=0; i<number.length(); i++){
            char c = number.charAt(i);
            
            while(ans.length() > 0 && ans.charAt(ans.length()-1) < c && k > 0){
                ans = ans.substring(0, ans.length() - 1);
                k--;
            }
            
            ans = ans + c;
        }
        
        if(k > 0){
            ans = ans.substring(0, ans.length() - k);
        }
        return ans;
    }
}