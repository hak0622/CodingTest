import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        //의상 종류별 개수를 저장할 해시맵
        HashMap<String,Integer> map = new HashMap<>();
        
        //의상 정보를 해시맵에 저장
        for(String[] clothe : clothes){
            String type = clothe[1]; //의상 종류
            map.put(type,map.getOrDefault(type,0)+1);
        }
        
        //조합 계산 : (종류1 개수 + 1) * (종류2 개수 + 1) ... -1
        for(int count : map.values()){
            answer = answer * (count+1); // 안 입는 경우 포함
        }
        return answer - 1; // 전부 안 입는 경우 제외
    }
}