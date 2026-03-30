class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder allNumbers = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        int currentNum = 0;
        
        while (allNumbers.length() < t * m) {
            String converted = Integer.toString(currentNum, n).toUpperCase();
            allNumbers.append(converted);
            currentNum++;
        }
        
        for (int i = 0; i < t; i++) {
            int targetIndex = (p - 1) + (i * m);
            answer.append(allNumbers.charAt(targetIndex));
        }
        
        return answer.toString();
    }
}