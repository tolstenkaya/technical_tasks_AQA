package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        calculatePrice(100,true);
    }

    public static double calculatePrice(double basePrice, boolean isVip) {
        if (isVip) return basePrice * 0.9;
        return basePrice;
    }

    public static String greet(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException();
        return "Hello, " + name;
    }
}