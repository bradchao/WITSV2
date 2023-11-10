package tw.brad.apps;

public class Brad04 {
    public static void main(String[] brad){
        // float 2^32 double 2^64
        float var1 = 10.0f;
        double var2 = 10.0;
        double var3 = 10 / 3.0;
        System.out.println(var3);
        double var4 = Math.random();
        // 0 ~ 100 => int random
        // 0.0 <= var4 < 1.0
        int score = (int)(var4 * 49) + 1 ;
        System.out.printf("Score = %d", score);
    }
}
