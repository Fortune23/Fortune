package com.xgileit;

public class Testing
{
    public static void main (String[] args)
    {
        Calculator myCalculator=new Calculator(100,25); //setting values for the object calculator
        //calling the methods and displaying them ;
        System.out.println("Addition result "+myCalculator.additional());
        System.out.println("multiplication result "+ myCalculator.multiplication());
        System.out.println("division result "+ myCalculator.division());
        System.out.println("subtraction result " +myCalculator.subtraction());
        

    }
}
