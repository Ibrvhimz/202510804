/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smartrestaurantorder;

import java.util.Scanner;

public class SmartRestaurantOrder {
    public static void main(String[] args) {
        final double DRINK_PRICE = 15.50;
        final double STUDENT_DISCOUNT_RATE = 0.10;
        final double SENIOR_DISCOUNT_RATE = 0.05;
        final double TIP_RATE = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer's name: ");
        String customerName = input.nextLine();

        System.out.print("Enter customer's age: ");
        int age = input.nextInt();

        System.out.print("Enter price of the meal: ");
        double mealPrice = input.nextDouble();

        System.out.print("Enter number of drinks ordered: ");
        int numberOfDrinks = input.nextInt();

        System.out.print("Is the customer a student? (true/false): ");
        boolean isStudent = input.nextBoolean();

        System.out.print("Enter service rating (1 to 5): ");
        int rating = input.nextInt();

        if (rating < 1 || rating > 5) {
            System.out.println("Error: Invalid service rating! Rating must be between 1 and 5.");
        } else {
            double drinksCost = numberOfDrinks * DRINK_PRICE;
            double subtotal = mealPrice + drinksCost;

            double discountRate = 0.0;
            if (isStudent) {
                discountRate = STUDENT_DISCOUNT_RATE;
            } else if (age >= 60) {
                discountRate = SENIOR_DISCOUNT_RATE;
            }

            double discountAmount = subtotal * discountRate;

            double tipAmount = 0.0;
            if (rating == 4 || rating == 5) {
                tipAmount = subtotal * TIP_RATE;
            }

            double finalBill = (subtotal - discountAmount) + tipAmount;
            int wholeAmount = (int) finalBill;

            System.out.println("\nSMART RESTAURANT");
            System.out.println("Customer: " + customerName);
            System.out.printf("Meal: $%.2f%n", mealPrice);
            System.out.printf("Drinks: $%.2f%n", drinksCost);
            System.out.printf("Discount: $%.2f%n", discountAmount);
            System.out.printf("Tip: $%.2f%n", tipAmount);
            System.out.printf("Final bill: $%.2f%n", finalBill);
            System.out.println("Whole amount: $" + wholeAmount);
        }

        input.close();
    }
}
