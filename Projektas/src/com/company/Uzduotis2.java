package com.company;


//Vartotojas įveda sveikų skaičių masyvą. Pirma įvedą masyvo ilgį n (1 < 20), tada įveda po vieną skaičius iki n.
//        Reikia suformuoti keletą masyvų ir juos išvesti. Vienas masyvas vienoje eilutėje.
//        1. Skaičiai kurie yra mažesni už paskutinį masyvo narį. 	{ 1, 3, 5, 10, 4 } => { 1, 3 }
//        2. Skaičiai kurie yra lyginiai.					{ 1, 3, 5, 10, 4 } => { 10, 4 }
//        3. Skaičiai kurie dalijasi iš masyvo elementų ilgio ( n )	{ 1, 3, 5, 10, 4 } => { 5, 10 }
//        4. Skaičiai kurie yra didesni už skaičių esantį kairiau.	{ 1, 3, 5, 10, 4 } => { 3, 5, 10 }


import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis2 {

    public void manoMasyvas() {


        Scanner input = new Scanner(System.in);
        System.out.println("Koks bus masyvo ilgis? ");
        int num = input.nextInt();
        int myArray[] = new int[num];


        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Fill in a position" + i + ":");
            myArray[i] = input.nextInt();
            input.nextLine();

        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.println("Even numbers: " + myArray[i]);

            }
        }


        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % myArray.length == 0) {
                System.out.println("Numbers that divide by array length: " + myArray[i]);
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] <= 0) {
                System.out.println("numbers that are higher than the number on the left: " + myArray[i]);
            }
        }
    }




        }


















