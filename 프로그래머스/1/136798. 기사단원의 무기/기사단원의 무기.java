class Solution {
    public int solution(int number, int limit, int power) {
        int totalWeight = 0;
        
        for (int i = 1; i <= number; i++) {
            int count = getDivisorCount(i);
            
            if (count > limit) {
                totalWeight += power;
            } else {
                totalWeight += count;
            }
        }
        
        return totalWeight;
    }
    
    private int getDivisorCount(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                count++;
            } else if (n % i == 0) {
                count += 2;
            }
        }
        return count;
    }
}