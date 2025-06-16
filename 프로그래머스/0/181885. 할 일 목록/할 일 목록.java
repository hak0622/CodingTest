class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int num = 0;
        int index = 0;
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                num++;
            }
        }
        String[]answer = new String[num];
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                answer[index++] = todo_list[i];
            }
        }
        return answer;
    }
}