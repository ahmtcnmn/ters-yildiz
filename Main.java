import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        System.out.print("Bir Sayı Giriniz :");
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= n - i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (n - i) * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

