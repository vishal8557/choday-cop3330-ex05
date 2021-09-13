package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
//Exercise 5 - Simple Math
       // You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

        //Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

        //Example Output
       // What is the first number? 10
        //What is the second number? 5
        //10 + 5 = 15
        //10 - 5 = 5
        //10 * 5 = 50
        //10 / 5 = 2
        //Constraints
        //Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
        //Keep the inputs and outputs separate from the numerical conversions and other processing.
        //Generate a single output statement with line breaks in the appropriate spots.
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number?");
        int First_Number = input.nextInt();
        System.out.println("What is the second number?");
        int second_number =input.nextInt();

        int the_sum = First_Number + second_number;
        System.out.printf(+First_Number+ "+" +second_number + "= %d\n",the_sum);
        int the_difference_in_the_numbers = First_Number -second_number;
        System.out.printf(+First_Number+ "-" +second_number + "= %d\n",the_difference_in_the_numbers);
        int the_product = First_Number * second_number;
        System.out.printf(+First_Number+ "*" +second_number + "= %d\n",the_product);
        int the_quotient = First_Number / second_number;
        System.out.printf(+First_Number+ "/" +second_number + "= %d",the_quotient);

    }
}
