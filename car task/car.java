class Car {

    // Attributes
    private String brand;
    private int speed;
    private boolean engineOn;
    private int fuelLevel;
    private int odometer;

    // Constructor
    public Car(String brand, int fuelLevel) {
        this.brand = brand;
        this.fuelLevel = fuelLevel;
        this.speed = 0;
        this.engineOn = false;
        this.odometer = 0;
    }

    // Behaviours
    public void startEngine() {
        engineOn = true;
        System.out.println(brand + " engine started.");
    }

    public void stopEngine() {
        engineOn = false;
        speed = 0;
        System.out.println(brand + " engine stopped.");
    }

    public void drive() {
        if (engineOn && fuelLevel > 0) {
            odometer += speed;
            fuelLevel--;
            System.out.println(brand + " is driving.");
        } else {
            System.out.println("Cannot drive.");
        }
    }
    public void moveFast() {
        if (engineOn) {
            speed += 20;
            System.out.println(brand + " is moving fast.");
        } else {
            System.out.println("Start the engine first.");
        }
    

    public void moveSlow() {
        if (engineOn && speed >= 10) {
            speed -= 10;
            System.out.println(brand + " slowed down.");
        }
    }

    public void moveLeft() {
        System.out.println(brand + " turned left.");
    }

    public void moveRight() {
        System.out.println(brand + " turned right.");
    }

    // Creative Feature
    public void turboMode() {
        if (engineOn && fuelLevel >= 5) {
            speed += 40;
            fuelLevel -= 5;
            System.out.println("Turbo Mode Activated!");
        } else {
            System.out.println("Turbo Mode unavailable.");
        }
    }
    public void displayStatus() {
        System.out.println("\nBrand: " + brand);
        System.out.println("Engine: " + engineOn);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuelLevel + "%");
        System.out.println("Odometer: " + odometer + " km");
    }
}