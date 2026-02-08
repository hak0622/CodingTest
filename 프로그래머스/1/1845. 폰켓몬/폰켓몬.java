import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        int max = nums.length / 2;
        return Math.min(set.size(),max);
    }
}