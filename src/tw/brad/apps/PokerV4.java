package tw.brad.apps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PokerV4 {
    public static void main(String[] args) {
        // 洗牌
        ArrayList<Integer> poker = new ArrayList<>();
        for (int i=0; i<52; i++)poker.add(i);
        Collections.shuffle(poker);
        //for (Integer card : poker)System.out.println(card);

        int[][] players = new int[4][13];
        for (int i=0; i<poker.size(); i++) {
            players[i%4][i/4] = poker.get(i);
        }

        String[] colors = {"黑桃","紅心","方塊","梅花"};
        String[] values = {"A ","2 ","3 ","4 ", "5 ", "6 ", "7 ",
                "8 ","9 ","10","J ", "Q ", "K "};

        for (int[] player : players) {
            Arrays.sort(player);
            for (int card : player) {
                System.out.printf("%s%s ", colors[card/13], values[card%13]);
            }
            System.out.println();
        }

    }
}
