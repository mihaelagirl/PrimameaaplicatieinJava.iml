package ro.ctrln.myfirstjavaproject.car;

import ro.ctrln.myfirstjavaproject.car.Car;

public class Main {

    public static void main(String[] args) {


        Car myCar = new Car("Black", "gasoline", 1500);
        myCar.engineStarted();
        System.out.println("My car's color is: " + myCar.getColor());
        myCar.setColor("Red");
        System.out.println("My car's color is: " + myCar.getColor());

        Car mySecondCar = new Car();

    }


    }
