class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        int a = num; //10
        int b = denom; // 8
        
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        int gcd = a;
        
        num = num / gcd;
        denom = denom / gcd;
        
        return new int[]{num,denom};
    }
}