package com.xgileit;

public class Calculator {
    int number1;
    int number2;

    public Calculator() {
        System.out.println("No arg Constructor");
    }

    public Calculator(int number1, int number2) {
        setNumber1(number1);
        setNumber2(number2);
    }

    private void setNumber2(int number2) { //setting value for number 2
        this.number2 = number2;
    }

    private void setNumber1(int number1) {  //setting value for number 1
        this.number1 = number1;
    }

    public int getNumber1() { //getting the number 1 value
        return number1;
    }

    public int getNumber2() {   //getting the number 2 value using get method
        return number2;
    }

    public int additional()        //adding to values and returning the sum value
    {
        int sum=number1+number2;
        return sum;
    }
    public int multiplication()
    {
        int multiply=number1*number2;
        return multiply;
    }
    public int division()
    {
        int division=number1/number2;
        return division;
    }
    public int subtraction()
    {
        int subtraction=number1-number2;
        return subtraction;
    }
}


