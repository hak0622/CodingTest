class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = "" + x;
        int sum = 0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            sum = sum + (c - '0');
        }
        
        return x % sum == 0 ? true : false;
    }
}