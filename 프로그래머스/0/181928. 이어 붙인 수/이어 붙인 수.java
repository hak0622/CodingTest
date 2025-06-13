class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                even = even + num_list[i];
            }else{
                odd = odd + num_list[i];
            }
        }
        int even1 = Integer.parseInt(even);
        int odd1 = Integer.parseInt(odd);
        answer = even1 + odd1;
    
        return answer;
    }
}