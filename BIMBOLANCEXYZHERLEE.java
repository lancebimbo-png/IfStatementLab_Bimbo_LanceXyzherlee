/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BIMBOLANCEXYZHERLEE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HELLO THERE");
        System.out.println("HOW OLD ARE YOU?");

        int a = input.nextInt();
        if (a < 13) {
            System.out.println("OHHHH, YOU ARE A CHILD");
        } else if (a >= 12 & a <= 19) {
            System.out.println("OHHHH, YOU ARE A TEENAGER");
        } else {
            System.out.println("OHHHH, YOU ARE A ADULT");
        }

        System.out.println("WHAT IS THE TODAY'S TEMPERATURE IN CELSIUS?");

        double b = input.nextDouble();
        if (b < 0) {
            System.out.println("FREEZING, RIGHT?");
        } else if (b >= (-1) & b <= 25) {
            System.out.println("NORMAL WEATHER");
        } else {
            System.out.println("HOT WEATHER");

        }

        System.out.println("WHAT IS YOUR TEST SCORE?");

        int c = input.nextInt();
        if (c > 90) {
            System.out.println("EXCELLENT");
        } else if (c <= 90 & c >= 75) {
            System.out.println("GOOD");
        } else {
            System.out.println("NEEDS IMPROVEMENT");
        }

        System.out.println("ENTER A RADIUS OF A CIRCLE");
        double r = input.nextDouble();
        double radius = r;

        double area = Math.PI * Math.pow(r, 2);
        double circumference = 2 * Math.PI * r;

        if (r <= 0) {
            System.out.println("INVALID RADIUS");
        } else if (r > 0) {
            System.out.println("Area = " + area + " and " + "Circumference = " + circumference);
        }

        System.out.println("ENTER AN INTEGER (EVEN OR ODD NUMBER)");
        int d = input.nextInt();
        int number = d;
        if (number % 2 == 0) {
            System.out.println( d +" is an even number");
        } else {
            System.out.println( d +" is an odd number");
        }
    }
}

