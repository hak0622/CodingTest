import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer>list = new ArrayList<>();
        int i=2;
        
        while(i<=n){
            if(n % i == 0){
                if(!list.contains(i)){
                    list.add(i);
                }
                n = n / i;
            }else{
                i++;
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}