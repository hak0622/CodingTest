class Solution {
    public int solution(int chicken) {
        int sum = 0;
        
        while(chicken >= 10){
            sum = sum + (chicken / 10); 
            chicken = (chicken / 10) + (chicken % 10);  
        }
        
        return sum;
    }
}