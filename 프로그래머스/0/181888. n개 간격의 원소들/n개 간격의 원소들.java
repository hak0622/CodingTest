class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = 0;
        int index = 0;
        
        for(int i=0; i<num_list.length; i=i+n){
            len++;
        }
        int[]answer = new int[len];
        
        for(int i=0; i<num_list.length; i=i+n){
            answer[index++] = num_list[i];
        }
        return answer;
    }
}