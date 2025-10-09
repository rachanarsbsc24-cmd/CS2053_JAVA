class Vehicle {
    String make;

    Vehicle(String make) {
        this.make = make;
    }

    void displayInfo() {
        System.out.println("Vehicle Make: " + make);
    }
}

class Car extends Vehicle {
    int manufactureYear;

    Car(String make, int manufactureYear) {
        super(make); 
        this.manufactureYear = manufactureYear;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Year of Manufacture: " + manufactureYear);
    }
}


class ElectricCar extends Car {
    int batteryKWh;

    
    ElectricCar(String make, int manufactureYear, int batteryKWh) {
        super(make, manufactureYear);
        this.batteryKWh = batteryKWh;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Battery Capacity: " + batteryKWh + " kWh");
    }
}

public class Lab_session3 {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar("Tesla", 2024, 100);
        myCar.displayInfo();
    }
}
