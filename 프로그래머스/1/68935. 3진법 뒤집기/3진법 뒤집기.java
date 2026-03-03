class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(three);
        sb.reverse();
        
        return Integer.parseInt(sb.toString(),3);
    }
}