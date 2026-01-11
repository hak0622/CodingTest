import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer>st = new Stack<>();
        int answer = 0;
        
        for(int move : moves){
            int col = move -1;
            
            for(int row = 0; row<board.length; row++){
                if(board[row][col] != 0){
                    int doll = board[row][col];
                    board[row][col] = 0;
                    
                    if(!st.isEmpty() && st.peek() == doll){
                        st.pop();
                        answer = answer + 2;
                    }else{
                        st.push(doll);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}