package com.java.pattern.creational.factory;

public class FactoryPatternDemo {
    public static void main(String[] args){
        AmericanBreads bread1 = BreadFactory.getBread("Adobe");
        AmericanBreads bread2 = BreadFactory.getBread("Hushpuppy");
        AmericanBreads bread3 = BreadFactory.getBread("Biscuit");
        bread1.history();
        bread2.history();
        bread3.history();
    }
}
