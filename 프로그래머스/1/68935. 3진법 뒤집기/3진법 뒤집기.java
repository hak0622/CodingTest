class Solution {
    public int solution(int n) {
        String s = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(s);
        String str = sb.reverse().toString();
        
        return Integer.parseInt(str,3);
    }
}