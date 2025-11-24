class Solution {
    public String solution(String polynomial) {
        String[]arr = polynomial.split(" ");
        StringBuilder sb = new StringBuilder();
        int num = 0;
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("+")){
                continue;
            }
            
            if(arr[i].contains("x")){
                if(arr[i].equals("x")){
                    count += 1;
                }else{
                    count += Integer.parseInt(arr[i].replace("x",""));
                }
            }else{
                num += Integer.parseInt(arr[i]);
            }
        }
        
        if(count != 0){
            if(count == 1){
                sb.append("x");
            }else{
                sb.append(count + "x");
            }
        }
        
        if(num != 0){
            if(sb.length() > 0){
                sb.append(" + ");
            }
            sb.append(num);
        }
        return sb.toString();
    }
}