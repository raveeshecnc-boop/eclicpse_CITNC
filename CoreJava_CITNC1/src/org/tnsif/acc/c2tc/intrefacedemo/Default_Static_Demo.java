package org.tnsif.acc.c2tc.intrefacedemo;

interface Vehicle {
    void start();
    void stop();

    final static int Max_speed = 120;

    default void repair() {
        System.out.println("We provide general repair service");
    }

    static void checkMaintaince() {
        System.out.println("Vehicle maintenance taken care here");
    }
}

class Car implements Vehicle {

    private String model;

    Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Car " + model + " starting");
    }

    @Override
    public void stop() {
        System.out.println("Car " + model + " stopping");
    }

    // Overriding default method
    @Override
    public void repair() {
        System.out.println("Car " + model + " repair service is available");
    }
}

class Bike implements Vehicle {

    private String type;

    Bike(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Bike " + type + " starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike " + type + " stopping");
    }

    // Overriding default method
    @Override
    public void repair() {
        System.out.println("Bike " + type + " repair service is available");
    }
}

public class Default_Static_Demo {

    public static void main(String[] args) {

        Vehicle car = new Car("KIA");
        Vehicle bike = new Bike("RX 100");

        car.start();
        car.stop();

        bike.start();
        bike.stop();

        car.repair();
        bike.repair();

        Vehicle.checkMaintaince();

        System.out.println("MaxSpeed " + Vehicle.Max_speed);
    }
}