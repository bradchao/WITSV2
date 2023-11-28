package tw.brad.utils;

public class Scooter extends Bike {
    private int gear;

    public Scooter(){
        // super();
        super(2);
        System.out.println("Scooter()");
    }

    public void upSpeed(){
        speed = speed < 1 ? 1 : speed * 1.7 * gear;
    }

    public void upSpeed(boolean isTurbo){
        if (isTurbo){
            speed = speed < 1 ? 1 : speed * 1.7 * gear * 2;
        }else{
            upSpeed();
        }
    }

    public boolean setGear(int gear){
        if (gear >= 0 && gear <= 4) {
            this.gear = gear;
            return true;
        }else {
            return false;
        }
    }

    public int getGear(){
        return gear;
    }
}
