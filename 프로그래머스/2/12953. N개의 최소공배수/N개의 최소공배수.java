class Solution {
    public int solution(int[] arr) {
        if(arr.length == 1) return arr[0];
        
        int cur = arr[0];
        
        for(int i=1; i<arr.length; i++){
            cur = lcm(cur, arr[i]);
        }
        
        return cur;
    }
    
    public int gcd(int a, int b){
        while(b > 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public int lcm(int a, int b){
        return (a * b) / gcd(a,b);
    }
}