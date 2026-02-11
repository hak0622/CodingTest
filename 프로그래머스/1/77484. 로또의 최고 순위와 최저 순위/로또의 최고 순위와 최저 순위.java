class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;

        for (int myNum : lottos) {
            if (myNum == 0) {
                zeroCount++;
            } else {
                for (int winNum : win_nums) {
                    if (myNum == winNum) {
                        matchCount++;
                        break; 
                    }
                }
            }
        }
        int maxHits = matchCount + zeroCount;
        int minHits = matchCount;

        return new int[] {getRank(maxHits), getRank(minHits)};
    }

    public int getRank(int hits) {
        if (hits == 6) return 1;
        if (hits == 5) return 2;
        if (hits == 4) return 3;
        if (hits == 3) return 4;
        if (hits == 2) return 5;
        return 6; 
    }
}