class Solution {
    public int solution(int n) {
        String number = Integer.toString(n,3);
        String reversed = new StringBuilder(number).reverse().toString();
        return Integer.parseInt(reversed,3);
    }
}