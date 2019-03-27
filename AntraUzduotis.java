import java.util.Arrays;
import java.util.Scanner;

public class AntraUzduotis {

    public static void main (String [] args) {
        antraUzduotis();
    }

    private static void antraUzduotis () {
        //Gaunamas masyvo ilgis
        System.out.println("Prasome ivesti masyvo ilgi nuo 1 iki 20");

        Scanner scanner = new Scanner(System.in);

        int masyvoIlgis = scanner.nextInt();

        if (masyvoIlgis < 21 && masyvoIlgis > 0) {
            //Sukuriamas masyvas
            int mas[] = new int[masyvoIlgis];

            Scanner input = new Scanner(System.in);
            //Ideda i masyva vartotojo ivesta skaiciu
            for (int i = 0; i < mas.length; i++) {
                System.out.println("Iveskite skaicius kuriuos saugosite");
                mas[i] = input.nextInt();
            }

            System.out.println("Skaiciai kurie yra mazesni uz paskutini masyvo nari");

            mazesnisUzPaskutini(mas);

            System.out.println("Lyginiai skaiciai esantys masyve");

            lyginiaiSkaiciai(mas);

            System.out.println("Skaiciai kurie dalinasi is masyvo ilgio");

            dalijasIsMasyvoIlgio(mas);

            System.out.println("Skaiciai kurie yra didesni nei skaicius esantis kaireje");

            didesnisUzKairiau(mas);

        } else {
            System.out.println("Iveskite taisyklingai masyvo ilgi nuo 1 iki 20");
        }
    }

    private static void mazesnisUzPaskutini (int mas[]) {
        //Nustatomas paskutinis skaicius is masyvo
        int paskutinsSkaicius  = mas[mas.length-1];
        //Surandami visi skaiciai mazesni uz paskutinis masyvo skaiciu
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < paskutinsSkaicius) {
                System.out.println(mas[i]);
            }
        }

    }

    private static void lyginiaiSkaiciai (int mas[]) {
        //Surandami visi esantys lyginiai skaiciai masyve
        for(int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                System.out.println(mas[i]);

            }
        }
    }

    private static void dalijasIsMasyvoIlgio (int mas[]) {
        //Surandami skaiciai kurie dalinasi is masyvo ilgio
        int masyvoIlgis = mas.length;
        for(int i = 0; i < mas.length; i++) {
            if (mas[i] % masyvoIlgis == 0) {
                System.out.println(mas[i]);
            }
        }
    }

    private static void didesnisUzKairiau (int mas[]) {
        int sum = 0;
        //Surandami skaiciai esantys didesni nei kareje
        for (int i = 0; i < mas.length -1; i++){
            if (mas[i] > mas[i + 1]){
                sum += 1;
                System.out.println(mas[i]);
            }
        }

    }

}
