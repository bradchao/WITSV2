package tw.brad.apps;

public class Brad08 {
    public static void main(String[] args){
        // 元素型別, 個數 => 宣告及初始化之後
        int[] a = new int[3];
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        //System.out.println(a[3]);   // [int >= 0 約 2G]
        a[1] = 123; a[0] = 7; a[2] = 44;
        for (int i=0; i< a.length; i++){
            System.out.println(a[i]);
        }



    }
}
