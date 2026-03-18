import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]num = new int[9];

        for(int i=0; i<9; i++){
            num[i] = sc.nextInt();
        }

        int max = num[0];

        for(int i=1; i<9; i++){
            if(num[i] > max){
                max = num[i];
            }
        }

        for(int i=0; i<9; i++){
            if(max == num[i]){
                System.out.println(num[i]);
                System.out.println(i+1);
            }
        }
    }
}
