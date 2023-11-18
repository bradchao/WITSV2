package tw.brad.apps;

public class Brad10 {
    public static void main(String[] args){
        // 擲骰子 => 100 次 => 統計個點出現次數
        int point;
        int[] p = new int[7];
        for (int i = 0; i< 10000000; i++){
            point = (int)(Math.random()*9) + 1;
            if (point >= 1 && point <= 9)
                p[point >= 7 ? point - 3 : point]++;
            else
                p[0]++;
        }

        if (p[0] == 0){
            for (int i=1; i<= 6; i++)
                System.out.printf("%d點出現 %d 次\n", i, p[i]);
        }else{
            System.out.println("ERROR:" + p[0]);
        }

    }
}
