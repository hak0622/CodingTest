import java.util.*;
import java.io.*;

public class Main{
    static int n;
    static boolean[]visited;
    static String[]arr;
    static List<String>list = new ArrayList<>();
    
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");
        visited = new boolean[10];
        dfs("",0);
        System.out.println(list.get(list.size()-1));
        System.out.print(list.get(0));
    }
    public static void dfs(String num, int idx){
        //주어진 부등호의 모든 조건을 완성하면 리턴
        if(idx == n+1){
            //부등호가 성립되는 모든 경우의 수 등록
            list.add(num);
            return;
        }
        //0~9 까지의 수
        for(int j=0; j<10; j++){
            //사용한 숫자인지 체크
            if(visited[j]){
                continue;
            }
            // Character.getNumericValue : char -> int 형으로 변환 (선택한 숫자)
			// j , arr[idx-1] : 선택한 숫자에 비교할 숫자와, 비교할 부등호
            if(idx == 0 || ckeck(Character.getNumericValue(num.charAt(idx - 1)), j , arr[idx-1])) {
				visited[j] = true;
				// true일시, num에 문자열 붙임
				dfs(num+j, idx+1);
				visited[j] = false;				
			}
        }
    }
    public static boolean ckeck(int a, int b, String c){
        if(c.equals(">")){
            if(a<b){
                return false;
            }
        }else if(c.equals("<")){
            if(a>b){
                return false;
            }
        }
        return true;
    }
}