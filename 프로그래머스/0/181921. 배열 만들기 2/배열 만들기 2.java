import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer>list = new ArrayList<>();
        Queue<Integer>queue = new LinkedList<>();
        
        queue.add(5);
        
        while(!queue.isEmpty()){
            int num = queue.poll();
            
            if(num >= l && num <= r){
                list.add(num);
            }
            
            if(num *10 <=r){
                queue.add(num*10);
            }
            if(num * 10 + 5 <=r){
                queue.add(num * 10 + 5);
            }
        }
        
        if(list.isEmpty()){
            return new int[]{-1};
        }
        
        return list.stream().mapToInt(x->x).toArray();
    }
}