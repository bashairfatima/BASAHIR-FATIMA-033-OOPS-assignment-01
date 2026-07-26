public class Main {
 public static void main(String[] args){
    Calculator citizen= new Calculator(9, 90);
    Calculator casio= new Calculator(citizen);
citizen.divide();
citizen.modulus();
System.out.println(“Current num1 of casio is:” + casio.getNum1());
System.out.println(“Changing num1 of casio!”);
casio.setNum1(89);
casio.display();
casio.divide();
}
}