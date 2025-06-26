class Solution {
    public String solution(String my_string, int m, int c) {
        String[]arr = new String[m];
        int index = 0;
        
        for(int i=0; i<m; i++){
            arr[i] = "";
        }
        
        for(int i=0; i<my_string.length(); i++){
            arr[index++] += my_string.charAt(i)+"";
            if(index == m){
                index = 0;
            }
        }
        String answer = arr[c-1];
        return answer;
    }
}