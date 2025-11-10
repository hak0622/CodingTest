import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder sb = new StringBuilder();
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int index1 = 0, index2 = 0;
        int temp = 0;
        Stack<String>st = new Stack<>();
        
        if(bin1.equals("0") && bin2.equals("0")){
            return "0";
        }
        for(int i=bin1.length()-1; i>=0; i--){
            if(bin1.charAt(i) == '1'){
                sum1 = sum1 + (int)Math.pow(2,index1);
                System.out.println("sum1 = " + sum1);
            }
            index1++;
        }
                
        for(int i=bin2.length()-1; i>=0; i--){
            if(bin2.charAt(i) == '1'){
                sum2 = sum2 + (int)Math.pow(2,index2);
                System.out.println("sum2 = " + sum2);
            }
            index2++;
        }
        
        sum3 = sum1 + sum2;
        
        while(sum3 >= 1){
            // if(sum3 == 1){
            //     st.push("1");
            //     break;
            // }
            temp = sum3 % 2; 
            System.out.println("temp = " + temp);
            st.push(temp + ""); 
    
            sum3 = sum3 / 2;
        }
      
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}

 // 2 9
 // 2 4  1 
 // 2 2  0
 //   1  0  