class Solution {
    public long solution(long n) {
        long answer = (long)Math.sqrt(n);
        if(answer * answer == n) return (long)Math.pow(answer + 1, 2);
        else return -1;
    }
}