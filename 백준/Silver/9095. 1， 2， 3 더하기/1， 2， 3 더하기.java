import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int arr[] = new int[11]; //최대 크기가 11보다 작다.

        arr[1] = 1; // 1을 넣을 경우 1가지
        arr[2] = 2; // 2 ~ 1+1 , 2  2가지
        arr[3] = 4; // 3 ~ 1+1+1. 2+1, 1+2, 3 4가지

        for(int i=0; i<num; i++){
            int n = sc.nextInt();
            for(int j=4; j<=n; j++){
                arr[j] = arr[j-1]+arr[j-2]+arr[j-3];
            }
            System.out.println(arr[n]);
        }
    }
}
