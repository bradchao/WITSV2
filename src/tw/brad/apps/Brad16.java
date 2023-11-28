package tw.brad.apps;

import tw.brad.utils.Scooter;

public class Brad16 {
    public static void main(String[] args){
        Scooter s1 = new Scooter();
        s1.upSpeed();s1.upSpeed();s1.upSpeed();s1.upSpeed();
        System.out.println(s1.getSpeed());
        s1.downSpeed();
        System.out.println(s1.getSpeed());
    }
}
