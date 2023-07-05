import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(i == 0 || i == n-1 || j == 0 || j == c-1 ? "*" : " ");
            }
            System.out.print("\n");
        }
    }
}
