package tw.brad.utils;

public class Bike extends Object{
    protected double speed;

    public Bike (){
        System.out.println("Bike()");
    }
    public Bike(int a){
        System.out.println("Bike(int)");
    }


    public void upSpeed(){
        speed = speed < 1 ? 1 : speed * 1.2;
    }

    public void downSpeed(){
        speed = speed < 1 ? 0 : speed * 0.7;
    }

    public double getSpeed(){
        return speed;
    }

}
