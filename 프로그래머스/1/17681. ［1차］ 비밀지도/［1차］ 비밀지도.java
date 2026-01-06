class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);
            
            while(binary1.length() < n){
                binary1 = "0" + binary1;
            }
            while(binary2.length() < n){
                binary2 = "0" + binary2;
            }
            
            for(int j=0; j<n; j++){
                char ch1 = binary1.charAt(j);
                char ch2 = binary2.charAt(j);
                
                if(ch1 == '1' || ch2 == '1'){
                    sb.append("#");
                }else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            sb.setLength(0);
        }
        return answer;
    }
}