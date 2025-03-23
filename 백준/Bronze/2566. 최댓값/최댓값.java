import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr = new int[9][9];  // 9 * 9 격자판
        int max = Integer.MIN_VALUE;
        int row=0;
        int col=0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int k=0; k<9; k++){
            for(int z=0; z<9; z++){
                if(arr[k][z]>max){
                    max = arr[k][z];
                    row=k;
                    col=z;                  
                }
            }
        }
        System.out.println(max);
        System.out.println((row+1) +" "+ (col+1));
    }
}
