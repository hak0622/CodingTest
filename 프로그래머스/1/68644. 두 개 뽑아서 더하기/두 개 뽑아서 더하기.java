import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer>list = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        Collections.sort(list);
        
        List<Integer>result = new ArrayList<>();
        int prev = -1;
        
        for(int num : list){
            if(num != prev){
                result.add(num);
                prev = num;
            }
        }
        
        int[]answer = new int[result.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}

