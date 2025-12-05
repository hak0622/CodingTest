class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int case1 = max - (max - min); 
        int case2 = (a + b - 1) - max;

        return case1 + case2;
    }
}