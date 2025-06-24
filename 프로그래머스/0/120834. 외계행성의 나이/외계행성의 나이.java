class Solution {
    public String solution(int age) {
       StringBuilder sb = new StringBuilder();
       String code = "abcdefghij";
       for(char ch : String.valueOf(age).toCharArray()){
           sb.append(code.charAt(ch - '0'));
       }
       return sb.toString();
    }
}