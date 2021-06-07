/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        double weight;
        double height;

        while(true) {
            try {
                System.out.print("What is your weight in pounds? ");
                weight = parseInt(input.nextLine());

                System.out.print("What is your height in inches? ");
                height = parseInt(input.nextLine());

                break;
            }
            catch(Exception e) {
                System.out.println("Sorry, please enter valid values. Try again.\n");
            }
        }

        double bmi = (weight / (height * height)) * 703;

        System.out.println("Your BMI is " + bmi + ".");

        if(18.5 < bmi && bmi < 25) {
            System.out.println("You are within the ideal weight range.");
        }else if(bmi <= 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        }else if(bmi >= 25) {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
