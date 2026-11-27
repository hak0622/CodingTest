class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i=1; i<arr.length; i++){
            int n = gcd(answer,arr[i]);
            answer = answer / n * arr[i];
        }
        
        return answer;
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