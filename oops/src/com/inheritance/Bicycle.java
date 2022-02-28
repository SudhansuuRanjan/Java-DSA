package com.inheritance;

public class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    @Override
    public String toString() {
        return ("No of gears are " + gear + "\n" + "Speed of bicycle is "+ speed);
    }
}

class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public  void setHeight(int newValue){
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}
class cycle extends Bicycle{

    public cycle(int gear, int speed) {
        super(gear, speed);
    }
    public  void look(){
        System.out.println("yftftutd");
    }
}

class test{
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3 , 100, 25);
        System.out.println(mb.toString());
        System.out.println();
        mb.applyBrake(5);
        System.out.println(mb.toString());
        System.out.println();
        mb.speedUp(10);
        mb.setHeight(30);
        System.out.println(mb.toString());
        System.out.println();
    }
}
