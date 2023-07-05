import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        for (int i = n; i <= c; i++){
            for (int j = 1; j <=9; j++){
                System.out.print(i + " " + "*" + j + " = " + (i*j) + "; ");
            }
            System.out.print("\n");
        }
    }
}
