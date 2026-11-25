class Solution {
    public int[] solution(int n, int m) {
        int n1 = gcd(n,m);
        int n2 = n1 * (n / n1) * (m / n1);
        
        return new int[]{n1,n2};
    }
    
    
    public int gcd(int a, int b){
        while(b != 0){
            int tmp = a % b; 
            a = b; 
            b = tmp;
        }
        return a;
    }
}