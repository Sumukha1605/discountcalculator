package com.shopping.discount_calculator;

public class App {

    public static double calculateFinalAmount(double bill, double discount) {
        double discountAmount = bill * discount / 100;
        return bill - discountAmount;
    }

    public static void main(String[] args) {

        double bill = 1000;
        double discount = 10;

        double finalAmount = calculateFinalAmount(bill, discount);

        System.out.println("Shopping Bill: ₹" + bill);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}