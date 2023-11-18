package tw.brad.apps;

public class Brad12 {
    public static void main(String[] args){
        int a = 0;
        while ( a < 10){
            System.out.println(a++);
        }
        System.out.println("---");
        a = 0;
        for (;a <10;){
            System.out.println(a++);
        }
    }
}
