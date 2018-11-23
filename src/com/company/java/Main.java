package com.company.java;

public class Main {

    static void check(int age)
    {
        try {
        if(age<18)
        {
            throw new ArithmeticException("Not eligible for Voting.");
        }
        else
            System.out.println("You are eligible for Voting.");
    }catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
	// write your code here
        check(12);
    }
}
