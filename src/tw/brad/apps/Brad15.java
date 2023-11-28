package tw.brad.apps;

import tw.brad.utils.Bike;

public class Brad15 {
    public static void main(String[] args){
        Bike b1 = new Bike(); Bike b2 = new Bike();
        //b1.speed = 12.3;
        System.out.println(b1.getSpeed());
        System.out.println(b2.getSpeed());
        System.out.println("-----");
        b1.upSpeed(); b1.upSpeed(); b1.upSpeed();b1.downSpeed();
        System.out.println(b1.getSpeed());
        b2.upSpeed();b2.upSpeed();b2.upSpeed();b2.upSpeed();b2.upSpeed();
        System.out.println(b2.getSpeed());
    }
}
