class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String num = Integer.toString(n,k);
        String[]arr = num.split("0");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].isEmpty()) continue;
            
            long change = Long.parseLong(arr[i]);
            
            if(isPrime(change)) answer++;
        }
        
        return answer;
    }
    
    public boolean isPrime(long n){
        if(n < 2) return false;
        
        for(long i=2; i*i<=n; i++){
            if(n % i == 0) return false;
        }
        
        return true;
    }
}