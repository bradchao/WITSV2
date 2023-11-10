// 11/8 練習作業
// 輸入年份資料, 並判斷顯示該年份是否為閏年
package tw.brad.apps;

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args){
        // 輸入資料
        Scanner input = new Scanner(System.in);
        System.out.print("輸入判斷年份: ");
        int year = input.nextInt();

        // 判斷顯示
        if (year % 4 == 0 ) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d年是<閏年>\n", year);
                }else {
                    System.out.printf("%d年是<平年>\n", year);
                }
            }else {
                System.out.printf("%d年是<閏年>\n", year);
            }
        }else {
            System.out.printf("%d年是<平年>\n", year);
        }

        //- 另一種判斷處理
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("%d年是<閏年>\n", year);
        }else {
            System.out.printf("%d年是<平年>\n", year);
        }

    }
}
