package com.java.pattern.creational.factory;

public class BreadFactory {
    public static AmericanBreads getBread(String breadType){
        if(breadType.equals("Biscuit")){
            return new Biscuit();
        }else if(breadType.equals("Adobe")){
            return new Adobe();
        }else{
            return new Hushpuppy();
        }
    }
}
