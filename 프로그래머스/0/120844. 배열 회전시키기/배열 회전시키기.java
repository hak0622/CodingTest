import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            list.add(numbers[i]);
        }
        if(direction.equals("right")){
            int right = list.remove(list.size() - 1);
            list.add(0,right);
        }else{
            int left = list.remove(0);
            list.add(left);
        }
        int[]answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}