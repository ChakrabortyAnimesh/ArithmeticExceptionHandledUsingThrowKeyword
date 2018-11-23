package com.company.java;

public class Main {

    static void check(int age)
    {
        try {
        if(age<18)
        {
            throw new ArithmeticException("You are below 18.");
        }
        else
            System.out.println("Your age is perfect for giving vote.");
    }catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
	// write your code here
        check(1);
    }
}
