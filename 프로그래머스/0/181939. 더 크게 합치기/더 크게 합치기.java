class Solution {
    public int solution(int a, int b) {
        int a2 = Integer.parseInt("" + a + b);
        int b2 = Integer.parseInt("" + b + a);
        return Math.max(a2, b2);
    }
}
