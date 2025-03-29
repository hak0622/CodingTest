class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0; i<=t.length()-p.length(); i++){
            String a ="";
            for(int j=i; j<p.length()+i; j++){
                char c = t.charAt(j);
                a+=c;
            }
            if(Long.parseLong(p)>=Long.parseLong(a)){
                answer++;
            }
        }
        return answer;
    }
}