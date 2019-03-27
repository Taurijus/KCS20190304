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
        int num = sc.nextInt();
        int arr[] = new int[20];

        for (int i = 0; i < arr.length; i++) ;
        System.out.println("Iveskite masyvo narius: ");

    }
}
