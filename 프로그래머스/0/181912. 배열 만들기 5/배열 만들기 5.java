import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer>list = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            String str = intStrs[i].substring(s,s+l);
            int x = Integer.parseInt(str);
            if(x > k){
                list.add(x);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}