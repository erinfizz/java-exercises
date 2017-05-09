package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * Created by Erin on 5/8/2017.
 */
public class Area {
    public static void main(String[] args) {

        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");

        int num = in.nextInt();

        while (num < 0) {
            System.out.println("You must enter a positive number.");

            System.out.println("Enter the radius of the circle: ");

            
        }

        area = (num * 3.14 * 3.14);
            System.out.println("The area of the circle is: " + area);

    }
}

