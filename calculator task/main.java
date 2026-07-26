9+90=99
9-90=-81
9*90=810
9/90=0.1
9%90=9
Total Objects Created: 3public class main {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();      // Uses 9 and 90
        Calculator c2 = new Calculator(9, 90); // Parameterized constructor
        Calculator c3 = new Calculator(c2);    // Copy constructor

        c1.add();
        c1.subtract();
        c2.multiply();
        c2.divide();
        c3.modulus();

        System.out.println("Total Objects Created: " + Calculator.getObjectCount());
    }
}