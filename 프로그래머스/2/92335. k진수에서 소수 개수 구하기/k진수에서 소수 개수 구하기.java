class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String s1 = Integer.toString(n,k);
        String[]s2 = s1.split("0");
        
        for(String s3 : s2){
            if(s3.equals("") || s3.equals("1")){
                continue;
            }
            long num = Long.parseLong(s3);
            
            if(isPrime(num)){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isPrime(long n){
        if(n<2) return false;
        
        for(long i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}