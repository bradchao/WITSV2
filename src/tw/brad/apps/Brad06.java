package tw.brad.apps;

public class Brad06 {
    public static void main(String[] args){
        int a = (int)(Math.random()*12) + 1;
        int days = 0;
        switch (a){
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6,9, 11:
                days = 30;
                break;
            case 2:
                days = 28;
                //break;
        }
        System.out.printf("%d月有%d天", a, days);
    }
}