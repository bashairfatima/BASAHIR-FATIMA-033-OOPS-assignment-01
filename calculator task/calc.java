class Calculator
{
private double num1;
private double num2;
private static int count=0;
public Calculator()
{
this.num1= 9;
this.num2= 90;
count++;
}
public Calculator(double num1, double num2)
{
    this.num1= num1;
    this.num2= num2;
    count++;
}
public Calculator(Calculator c1)
{
    this.num1= c1.num1;
    this.num2= c1.num2;
    count++;
}
public double add()
{
double result= num1+num2;
    System.out.println(num1 + "+" + num2 + "=" + result);
    return result;
}
public double multiply()
{
double result= num1*num2;
    System.out.println(num1 + "*" + num2 + "=" + result);
    return result;
}
public double divide()
{
double result= num1/num2;
    System.out.println(num1 + "/" + num2 + "=" + result);
    return result;
}
public double modulus()
{
double result= num1%num2;
    System.out.println(num1 + "%" + num2 + "=" + result);
    return result;
}
public double subtract()
{
    double result= num1-num2;
    System.out.println(num1 + "-" + num2 + "=" + result);
    return result;
}


 public double getNum1()
{
        return num1;
}
public double getNum2()
{
        return num2;
}
public void setNum1(double num1)
{
        this.num1 = num1;
}
public void setNum2(double num2)
{
        this.num2 = num2;
}
public static int getObjectCount()
{
return count;
}
public void display()
{
    System.out.println("Your first number is:"+ num1 + " and your second number is:" + num2);
}


}