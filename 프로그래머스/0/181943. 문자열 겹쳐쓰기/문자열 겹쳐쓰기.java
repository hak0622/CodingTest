class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder(my_string);
        answer.replace(s,s + overwrite_string.length(),overwrite_string);
        return answer.toString();
    }
}