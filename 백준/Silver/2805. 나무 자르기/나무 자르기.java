import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[]tree = new int[N];
        
        int min = 0;
        int max = 0;
        
        //나무들 중 최댓값을 구하기 위해 입력 때마다 max 변수와 비교
        //입력 받은 나무가 max 보다 크면 변경 
        for(int i=0; i<N; i++){
            tree[i]=sc.nextInt();
            
            if(max<tree[i]){
                max=tree[i];
            }
        }
        while(min<max){
            int mid = (min+max)/2;
            long sum = 0;
            for(int height : tree){
                //tree 잘린 길이 = tree의 높이 - 자르는 위치(mid)
                //tree의 잘린 길이의 합을 구한다.
                //이때 자르는 위치가 주어진 나무의 높이보다 클 수 있기 때문에
                //0 이하인 경우(=음수)에는 합산을 하지 않고 양수만 합산하도록 해야한다.
                if(height - mid > 0){
                    sum+=(height-mid);
                }
            }
            //자른 나무 길이의 합이 M 보다 작다는 것은 
            //자르는 위치(높이)가 높다는 의미이므로 높이를 낮춰야 한다.
            //즉, 상한(max)를 줄여야 한다.
            if(sum<M){
                max=mid;
            }
            //자른 나무 길이의 합이 M보다 크다는 것은
            //자르는 위치(높이)가 낮다는 의미이므로 높이를 높여야 한다.
            //또한, 같을 경우에는 최대한 적게 자르기 위해 자르는 높이를
            //높여야 하므로 하한(min)을 올려야 한다.
            else{
                min = mid + 1;
            }
        }
        System.out.println(min-1);
    }
}