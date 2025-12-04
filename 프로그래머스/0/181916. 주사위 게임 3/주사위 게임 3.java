class Solution {
    public int solution(int a, int b, int c, int d) {
        int[]arr = {a,b,c,d};
        
        int[]count = new int[7];
        for(int x : arr){
            count[x]++;
        }
        
        for(int i=1; i<=6; i++){
            if(count[i]==4){
                return 1111*i;
            }
        }
        
        for(int i=1; i<=6; i++){
            if(count[i] == 3){
                for(int j=1; j<=6; j++){
                    if(count[j] == 1){
                        return (int)Math.pow(10 * i + j, 2);
                    }
                }
            }
        }
        
        int p=0;
        int q=0;
        
        for(int i=1; i<=6; i++){
            if(count[i] ==2){
                if(p==0){
                    p=i;
                }else{
                    q=i;
                }
            }
        }
        
        if(p!=0 && q!=0){
            return (p+q) * Math.abs(p-q);
        }
        
        for(int i=1; i<=6; i++){
            if(count[i] == 2){
                int x = 0,y = 0;
                for(int j=1; j<=6; j++){
                    if(count[j] == 1){
                        if(x==0){
                            x=j;
                        }else{
                            y=j;
                        }
                    }
                }
                return x * y;
            }
        }
        
        int min = 7;
        for(int x : arr){
            min = Math.min(min,x);
        }
        return min;
    }
}