package org.example;

import org.patient.Patient;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient[] patients = new Patient[10];
        patients[0] = new Patient(1, "Smith", "John", "Doe", "123 Main St", "1551234", 12345, "Fever");
        patients[1] = new Patient(2, "Johnson", "Alice", "Eve", "456 Elm St", "2555678", 56789, "Headache");
        patients[2] = new Patient(3, "Brown", "Robert", "Lee", "789 Oak St", "3559876", 98765, "Flu");
        patients[3] = new Patient(4, "Davis", "Emily", "Grace", "101 Pine St", "4554321", 43210, "Cough");
        patients[4] = new Patient(5, "Wilson", "Sarah", "Ann", "202 Maple St", "5558765", 87654, "Flu");
        patients[5] = new Patient(6, "Johnson", "David", "Michael", "303 Elm St", "6551111", 11111, "Sore Throat");
        patients[6] = new Patient(7, "Garcia", "Maria", "Lopez", "404 Oak St", "7552222", 22222, "Rash");
        patients[7] = new Patient(8, "Lee", "James", "Patrick", "505 Cedar St", "8553333", 33333, "Sprained Ankle");
        patients[8] = new Patient(9, "Martin", "Linda", "Jane", "606 Birch St", "9554444", 44444, "Migraine");
        patients[9] = new Patient(10, "Anderson", "Paul", "William", "707 Pine St", "5555555", 55555, "Diabetes");


        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть діагноз: ");
        String recievedDiagnosis = scanner.nextLine();
        while (count != patients.length) {
            if(Objects.equals(patients[count].getDiagnosis(), recievedDiagnosis)) {
                System.out.println(patients[count].toString());
            }
            count++;
        }


        System.out.println("Введіть нижню межу вибірки номеру медичних карт: ");
        int lowerCardNumber = scanner.nextInt();
        System.out.println("Введіть верхню межу вибірки номеру медичних карт: ");
        int higherCardNumber = scanner.nextInt();
        count = 0;
        while (count != patients.length) {
            if (patients[count].getMedicalCardNumber() <= higherCardNumber && patients[count].getMedicalCardNumber() >= lowerCardNumber) {
                System.out.println(patients[count].toString());
            }
            count++;
        }

        System.out.println("Введіть першу цифру номеру телефону: ");
        Scanner scanner1 = new Scanner(System.in);
        String firstNumberInPhoneNumber = scanner1.nextLine();
        count = 0;
        int patientsCount = 0;
        while (count != patients.length) {
           if (Objects.equals(patients[count].getPhoneNumber().charAt(0), firstNumberInPhoneNumber.charAt(0))) {
               System.out.println(patients[count].toString());
               patientsCount++;
           }
           count++;
        }
        System.out.println("Кількість пацієнтів з введеною першою цифрою номеру телефону: " + patientsCount);
    }
}