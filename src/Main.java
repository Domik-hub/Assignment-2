public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Islambek", "A08108");
        Driver driver2 = new Driver("Damir", "B45875");

        Vehicle car = new Car("Toyota", 2020, driver1, 4, "92");
        Vehicle motorcycle = new Motorcycle("BMW", 2018, driver1, false);
        Vehicle truck = new Truck("Volvo", 2015, driver2, 12.5, 6);

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.displayDriverInfo();
            v.stopEngine();
            System.out.println("---------------------");
        }
    }
}
