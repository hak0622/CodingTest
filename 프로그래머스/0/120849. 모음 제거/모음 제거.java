class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[]mos = {"a","e","i","o","u"};
        for(String mo : mos){
            answer = answer.replaceAll(mo,"");
        }
        return answer;
    }
}