package ro.ctrln.myfirstjavaproject.car;

public class Car extends Drivable {
    private String color;
    private String fuelType;
    private int engineCapacity;

    public  Car(String color, String fuelType, int engineCapacity) {
        this.color = color;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    public Car() {}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) throws Exception {
        if(engineCapacity < 1000) {
            throw new Exception();
        }
        this.engineCapacity = engineCapacity;
    }

        public void engineStarted(){
            System.out.println("Engine started");
        }

    @Override
    public void drive() {
        System.out.println("Started driving");
    }
}



