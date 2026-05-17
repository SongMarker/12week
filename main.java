import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // 전체 사람 수
        int a = sc.nextInt();       // 촌수 구할 사람 1
        int b = sc.nextInt();       // 촌수 구할 사람 2
        int m = sc.nextInt();       // 관계 수

        int[][] relations = new int[m][2];
        for (int i = 0; i < m; i++) {
            relations[i][0] = sc.nextInt(); // 부모
            relations[i][1] = sc.nextInt(); // 자식
        }

        System.out.println("n=" + n + " a=" + a + " b=" + b + " m=" + m);
    }
}