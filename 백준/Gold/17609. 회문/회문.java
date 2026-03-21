import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String s = sc.next();
            System.out.println(isCheck(s, 0, s.length() - 1, 0));
        }
    }

    public static int isCheck(String s, int left, int right, int chance) {
        if (left >= right) return 0;

        if (s.charAt(left) == s.charAt(right)) {
            return isCheck(s, left + 1, right - 1, chance);
        } else if (chance == 0) {
            if (isCheck(s, left + 1, right, 1) == 0 || isCheck(s, left, right - 1, 1) == 0) {
                return 1;
            } else {
                return 2;
            }
        }else {
            return 2;
        }
    }
}
