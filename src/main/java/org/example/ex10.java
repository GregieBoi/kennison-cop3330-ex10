/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex10 {

    // main
    public static void main(String[] args) {

        // initialize variables, calculate tax and total, and set format
        double subtotal = checkout();
        double tax = subtotal * 0.055;
        double total = subtotal + tax;
        DecimalFormat df = new DecimalFormat("0.00");

        // create string for output
        String output = "Subtotal: $" + df.format(subtotal) + "\n"
                + "Tax: $" + df.format(tax) + "\n"
                + "Total: $" + df.format(total);

        // print output
        System.out.println(output);

    }

    // simulates checkout
    public static double checkout() {

        // initialize total
        double total = 0;

        // enter for loop
        for (int i = 0; i < 3; i++) {

            // prompt for price and store scan
            System.out.print("Enter the price of item " + (i + 1) + ": ");
            Scanner price_in = new Scanner(System.in);
            double price = price_in.nextDouble();

            // prompt for quantity and store scan
            System.out.print("Enter the quantity of item " + (i + 1) + ": ");
            Scanner quant_in = new Scanner(System.in);
            double quant = quant_in.nextDouble();

            // update/calculate total
            total += (price * quant);

        }
        // exit loop

        // return total
        return total;
    }
}
