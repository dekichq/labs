package org.example;

import java.util.Date;
import java.util.Scanner;

public class Lab1 {

    private double x = 0.33;
    private double y = 0.12;

    public double calculateS() {
        return 1 + x + (Math.pow(x, 2) / 2) + (Math.pow(x, 3) / 8) + (Math.pow(x, 4) / 64);
    }
    public double calculateF() {
        return x * (Math.sin(x) + Math.cos(y));
    }

    public void setNumbers() {
        System.out.println("Введіть x: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        System.out.println("Введіть y: ");
        y = scanner.nextDouble();
    }

    public void printResults() {
        System.out.println("S = " + calculateS());
        System.out.println("F = " + calculateF());
    }

    public void printDate() {
        Date date = new Date();
        System.out.printf("Сьогодні %1$te %1$tb %1$tY\n", date);
    }

    public static void main(String[] args) {
        Lab1 lab1 = new Lab1();
        lab1.printResults();
        lab1.setNumbers();
        lab1.printResults();
        lab1.printDate();
    }
}