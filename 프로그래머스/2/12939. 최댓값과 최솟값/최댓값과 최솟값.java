class Solution {
    public String solution(String s) {
        String[]s1 = s.split(" ");
        int max = Integer.parseInt(s1[0]);
        int min = Integer.parseInt(s1[0]);
        
        for(int i=1; i<s1.length; i++){
            max = Math.max(max,Integer.parseInt(s1[i]));
            min = Math.min(min,Integer.parseInt(s1[i]));
        }
        
        return min + " " + max;
    }
}