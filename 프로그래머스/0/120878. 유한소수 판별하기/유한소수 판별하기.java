class Solution {
    public int solution(int a, int b) {
        int A = a;
        int B = b;
        
        while(B != 0){
            int r = A % B;
            A = B;
            B = r;
        }
        int gcd = A;
        
        b = b / gcd;
        
        while(b % 2 ==0){
            b = b / 2;
        }
        while(b % 5 ==0){
            b = b / 5;
        }
        
        return b==1 ? 1 : 2;
    }
}