class Solution {
    public int solution(int slice, int n) {
        double answer = 0;
        answer = (double)n / slice;
        return (int)Math.ceil(answer);
    }
}