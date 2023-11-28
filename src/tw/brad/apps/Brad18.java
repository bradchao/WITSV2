package tw.brad.apps;

public class Brad18 {
    public static void main(String[] args){
        Brad182 obj1 = new Brad182(3);
    }
}
class Brad181 {
    Brad181(){
        System.out.println("Brad181()");
    }
}
class Brad182 extends Brad181 {
    Brad182(){
        this(2);
        System.out.println("Brad182()");
    }
    Brad182(int a){
        this(true);
        System.out.println("Brad182(int)");
    }
    Brad182(boolean a){
        //this(); super();
        System.out.println("Brad182(boolean)");
    }

}