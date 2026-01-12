class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int match = 0;
        
        for(int i=0; i<6; i++){
            if(lottos[i] == 0){
                zero++;
            }else{
                for(int j=0; j<6; j++){
                    if(lottos[i] == win_nums[j]){
                        match++;
                        break;
                    }
                }
            }
        }
        
        int max = match + zero;
        int min = match;
        
        int maxRank;
        if(max == 6) maxRank = 1;
        else if(max == 5) maxRank = 2;
        else if(max == 4) maxRank = 3;
        else if(max == 3) maxRank = 4;
        else if(max == 2) maxRank = 5;
        else maxRank = 6;
        
        int minRank;
        if(min == 6) minRank = 1;
        else if(min == 5) minRank = 2;
        else if(min == 4) minRank = 3;
        else if(min == 3) minRank = 4;
        else if(min == 2) minRank = 5;
        else minRank = 6;
        
        return new int[]{maxRank,minRank};
    }
}