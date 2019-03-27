package lt.kaunascoding;

import java.util.Scanner;

/*Vartotojas įveda sveikų skaičių masyvą. Pirma įvedą masyvo ilgį n (1 < 20), tada įveda po vieną skaičius iki n.
Reikia suformuoti keletą masyvų ir juos išvesti. Vienas masyvas vienoje eilutėje.
1. Skaičiai kurie yra mažesni už paskutinį masyvo narį.     { 1, 3, 5, 10, 4 } => { 1, 3 }
2. Skaičiai kurie yra lyginiai.                    { 1, 3, 5, 10, 4 } => { 10, 4 }
3. Skaičiai kurie dalijasi iš masyvo elementų ilgio ( n )    { 1, 3, 5, 10, 4 } => { 5, 10 }
4. Skaičiai kurie yra didesni už skaičių esantį kairiau.    { 1, 3, 5, 10, 4 } => { 3, 5, 10 }

Skaidyti užduotį į funkcijas. (pvz.: nuskaityti masyvą, išspausdinti masyvą, rasti visus lyginius skaičius..)
*/
public class Uzduotis2 {
    Scanner sc = new Scanner(System.in);

    public void masyvas() {
        System.out.println("Iveskite masyvo ilgį.");
        int num = sc.nextInt();
        int mas[] = new int[num];

        for (int i = 0; i < mas.length; i++) {
            System.out.println("Iveskite masyvo: " + "'" + (i + 1) + "'" + " skaičių: ");
            mas[i] = sc.nextInt();
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Masyvo nariai: " + (i + 1) + " : " + mas[i] + "\n");
        }
        for (int i = 0; i < mas.length; i++) {
            if (num > mas[i]) {
                System.out.println("Įvesti skaiciai mazesni nei paskutinis įvestas masyvo narys: " + mas[i]);
            }
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                System.out.println("Masyvo skaičiai kurie yra lyginiai: " + mas[i]);
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % mas.length == 0) {
                System.out.println("Skaiciai kurie dalinasi is masyvo elementu ilgio: " + mas[i]);
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[0] <= i) {
                System.out.println("Skaičiai kurie yra didesni už skaičių esantį kairiausiai: " + mas[i]);
            }
        }
    }
}