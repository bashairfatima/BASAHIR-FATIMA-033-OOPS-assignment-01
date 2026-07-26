public class Main {

    public static void main(String[] args) {

        // Creating two car objects
        Car toyota = new Car("Toyota Corolla", 50);
        Car honda = new Car("Honda Civic", 80);

        // Toyota Car
        System.out.println("===== Toyota Corolla =====");
        toyota.startEngine();
        toyota.moveFast();
        toyota.drive();
        toyota.moveLeft();
        toyota.turboMode();
        toyota.displayStatus();

        System.out.println();

        // Honda Car
        System.out.println("===== Honda Civic =====");
        honda.startEngine();
        honda.moveFast();
        honda.moveSlow();
        honda.drive();
        honda.moveRight();
        honda.displayStatus();
    }
}