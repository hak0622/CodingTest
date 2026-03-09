class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            String s1 = Integer.toString(arr1[i],2);
            String s2 = Integer.toString(arr2[i],2);
            
            if(s1.length() < n){
                int count1 = n - s1.length();
                for(int k1=0; k1<count1; k1++){
                    s1 = "0" + s1;
                }
            }
            
            if(s2.length() < n){
                int count2 = n - s2.length();
                for(int k2=0; k2<count2; k2++){
                    s2 = "0" + s2;
                }
            }
            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);
            
            for(int j=0; j<n; j++){
                char c1 = s1.charAt(j);
                char c2 = s2.charAt(j);
                
                if(c1 == '1' || c2 == '1'){
                    sb.append("#");
                }else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            System.out.println("answer = " + answer[i]);
        }
        return answer;
    }
}