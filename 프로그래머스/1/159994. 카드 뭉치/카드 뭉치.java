class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        int goalIdx = 0;
        
        while(goalIdx < goal.length){
            if(idx1 < cards1.length && cards1[idx1].equals(goal[goalIdx])){
                idx1++;
                goalIdx++;
            }else if(idx2 < cards2.length && cards2[idx2].equals(goal[goalIdx])){
                idx2++;
                goalIdx++;
            }else{
                return "No";
            }
        }
        
        return "Yes";
    }
}