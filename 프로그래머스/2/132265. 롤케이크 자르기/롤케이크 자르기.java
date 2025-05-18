class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int maxTopping = 10001; //토핑 최대값 10000이라고 가정
        int[] leftCount = new int[maxTopping]; //왼쪽 토핑 개수
        int[] rightCount = new int[maxTopping]; //오른쪽 토핑 개수
        int leftKind = 0;
        int rightKind = 0;
        
        //오른쪽 토핑 개수를 모두 세고 종류 수 센다
        for(int i : topping){
            if(rightCount[i] == 0){
                rightKind++;
            }
            rightCount[i]++;
        }
        //하나씩 왼쪽으로 옮기면서 비교
        for(int i : topping){
            if(leftCount[i] == 0){
                leftKind++;
            }
            leftCount[i]++;
            
            rightCount[i]--;
            if(rightCount[i] == 0){
                rightKind--;
            }
            if(leftKind == rightKind){
                answer++;
            }
        }
        return answer;
    }
}