import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        boolean b = true;
        for (int i = n; i <= c; i++) {
            for (int j = 2; j < i; j++) {
                if (i % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(i);
            else b = true;
        }
    }
}


