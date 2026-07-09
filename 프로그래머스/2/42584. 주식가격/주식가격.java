class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int second = 0; 
            
            for (int j = i + 1; j < n; j++) {
                second++; 
                
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = second;
        }

        return answer;
    }
}