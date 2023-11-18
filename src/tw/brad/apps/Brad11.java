package tw.brad.apps;

public class Brad11 {
    public static void main(String[] args){
        // Array != Matrix => X空間幾何X
        // Array => 線性
        int[][] a = new int[3][4];
        int[][] b = new int[3][];

        b[0] = new int[2];
        b[1] = new int[3];
        b[2] = new int[4];

        a[1][2] = 172;
        a[2][3] = 111;

        for (int i=0; i<b.length; i++){
            for (int j=0; j<b[i].length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---");
        for (int[] v : b){
            for (int value : v){
                System.out.print(value + " ");
            }
            System.out.println();
        }




    }
}
