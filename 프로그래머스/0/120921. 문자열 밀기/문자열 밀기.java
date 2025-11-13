class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)){
            return 0;
        }
        
        String addAB = B + B;
        int index = addAB.indexOf(A);
        
        if(index == -1){
            return -1;
        }
    
        return index;
    }
}