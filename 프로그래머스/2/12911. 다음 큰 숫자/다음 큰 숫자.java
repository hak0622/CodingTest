class Solution {
    public int solution(int n) {
        int answer = 0;
        int oneCount = Integer.bitCount(n);
        
        while(true){
            n++;
            if(Integer.bitCount(n) == oneCount) return n;
        }
    }
}