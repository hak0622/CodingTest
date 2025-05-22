import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[]arr = new int[N];
        
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        //배열은 정렬되어야 한다.
        Arrays.sort(arr);
        int M = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            if(binarySearch(arr,sc.nextInt())>=0){
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
    public static int binarySearch(int[]arr,int key){
        int low = 0; //왼쪽
        int high = arr.length - 1;
        int mid;
        while(low <= high){
            mid = (low + high)/2; //중간값
            
            //key 값이 중간 위치의 값보다 작을 경우
            if(key == arr[mid]){
                return mid;
            }
            // key 값이 중간 위치의 값보다 작을 경우
            else if(key<arr[mid]){
                high = mid - 1;
            }
            //key 값과 중간 위치의 값이 같을 경우
            else{
                low = mid + 1;
            }
        }
        //찾고자 하는 값이 존재하지 않는 경우
        return -1;
    }
}