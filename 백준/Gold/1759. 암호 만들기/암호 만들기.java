import java.util.*;
import java.io.*;

public class Main{
    static int L,C;
    static String[]pwd,alpha;
    
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]str1 = br.readLine().split(" ");
        L = Integer.parseInt(str1[0]); //암호 길이
        C = Integer.parseInt(str1[1]); //암호에 사용될 알파벳 갯수
        
        pwd = new String[L];
        alpha = new String[C];
        
        alpha = br.readLine().split(" ");
        Arrays.sort(alpha);
        combine(0,0);
    }
    static void combine(int len, int start){
        if(len>=L){
            if(check(pwd)){
                for(String p : pwd){
                    System.out.print(p);
                }
                System.out.println();
            }
            return;
        }
        for(int i=start; i<C; i++){
            pwd[len] = alpha[i];
            combine(len+1, i+1);
        }
    }
    static boolean check(String[]pwd){
        int c = 0; //자음
        int v = 0; //모음
        
        for(int i=0; i<pwd.length; i++){
            if(pwd[i].equals("a")||pwd[i].equals("e")||pwd[i].equals("i")||pwd[i].equals("o")||pwd[i].equals("u")){
                v++;
            }else{
                c++;
            }
        }
        if(c>=2 && v>=1){
            return true;
        }else{
            return false;
        }
    }
}