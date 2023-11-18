package tw.brad.apps;

import java.util.Scanner;

public class Brad13 {
    public static void main(String[] args){
        // 1 + 2 + 3 + ... + n = ?
        System.out.printf("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1, sum = 0;
        while ( i <= n){
            sum = sum + i;
            i++;
        }
        System.out.printf("1 + 2 + ... + %d = %d", n, sum);
    }
}
