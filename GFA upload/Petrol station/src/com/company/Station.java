package com.company;

public class Station {
    int gasAmount;

    public Station(){
        gasAmount=1000;
    }

    public void refill(Car car){
        car.gasAmount+=gasAmount;
//        car.gasAmount += car.capacity;
//        gasAmount-= car.capacity;
    }

    public static void main(String [] args){
        Car car = new Car();
        Station station = new Station();
        System.out.println(station.gasAmount);
        System.out.println(car.gasAmount);
        station.refill(car);
        System.out.println(station.gasAmount);
        System.out.println(car.gasAmount);
    }
}
