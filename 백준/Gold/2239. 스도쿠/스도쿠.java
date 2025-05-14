import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static int[][] arr = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 9; i++){
            String line = br.readLine();
            for(int j = 0; j < 9; j++){
                arr[i][j] = line.charAt(j) - '0'; // 각 문자 -> 숫자 변환
            }
        }

        sudoku(0, 0);
    }

    public static void sudoku(int row, int col){
        if(col == 9){
            sudoku(row + 1, 0);
            return;
        }

        if(row == 9){
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            System.exit(0);
        }

        if(arr[row][col] == 0){
            for(int i = 1; i <= 9; i++){
                if(posible(row, col, i)){
                    arr[row][col] = i;
                    sudoku(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }

        sudoku(row, col + 1);
    }

    public static boolean posible(int row, int col, int value){
        for(int i = 0; i < 9; i++){
            if(arr[row][i] == value || arr[i][col] == value){
                return false;
            }
        }

        int setRow = (row / 3) * 3;
        int setCol = (col / 3) * 3;

        for(int i = setRow; i < setRow + 3; i++){
            for(int j = setCol; j < setCol + 3; j++){
                if(arr[i][j] == value){
                    return false;
                }
            }
        }

        return true;
    }
}
