import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            ArrayList<Grade>list = new ArrayList<>();
            for(int j=0; j<N; j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                list.add(new Grade(a,b));
            }
            Collections.sort(list); //오름차순 정렬
            int answer = 1; //서류 1등은 무조건 통과
            int min = list.get(0).b; // 면접 점수 최소값
            for(int k=0; k<N; k++){ //서류 2등부터 시작 
                if(list.get(k).b<min){ //이전의 최소 면접 점수보다 낮으면 통과
                    answer++;
                    min = list.get(k).b;
                }
            }
            System.out.println(answer);
        }
    }
}

class Grade implements Comparable<Grade>{
    int a;
    int b;
    
    Grade(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int compareTo(Grade o){
        if(this.a > o.a){
            return 1;
        }else{
            return -1;
        }
    }
}