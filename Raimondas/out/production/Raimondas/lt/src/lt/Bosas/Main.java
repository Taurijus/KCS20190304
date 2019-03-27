package lt.Bosas;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        isvestiIekrana();
//        kIekIvesiSkaiciu();
        kiekVeliaveliu();
    }

    public static void isvestiIekrana() {
        System.out.println("Hello World");
        System.out.println("This is my first test.");
        System.out.println("I hope this will a good one!");
    }

    public static void kIekIvesiSkaiciu() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Kiek norite įvesti skaičių?");
        int iv = myObj.nextInt();
//        System.out.println( iv);
        String sk = myObj.nextLine();
        int i = 0;
        int sk1 = 0;
        int rez = 0;
        int[] digitals = new int[iv];

        while (i <= iv - 1) {
            System.out.println("Įveskite " + (i+1) +" skaičių");
            sk = myObj.nextLine();
            if (sk.matches("\\d+")) {
                 sk1 = Integer.parseInt(sk);
                digitals[i] = sk1;
                i++;
                rez += sk1;
//                if (i <= iv - 1) {
//                    System.out.println("Įveskite kitą skaičių . . . ");
//                    sk = myObj.nextLine();
//                }
            } else {
                System.out.println("Įvedėte ne skaičių Įveskite skaičių . . . ");
                sk = myObj.nextLine();
            }
        }
        Skaiciavimai skaiciuot=new Skaiciavimai();
        Spausdinti print=new Spausdinti();

        print.spausdinti(digitals,skaiciuot.skaiciaiMazesnuUzPaskutiniNari(digitals));
        print.spausdinti(digitals,skaiciuot.lyginiai(digitals));
        print.spausdinti(digitals,skaiciuot.skaiciaiKurieDalijasiIsMasyvoElementuSkaiciaus(digitals));
        print.spausdinti(digitals,skaiciuot.skaiciaiKurieDidesniUzEsantiKairiau(digitals));
    }
    public static void kiekVeliaveliu(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Kiek prikarpe kruvelių?");

        int kruv=myObj.nextInt();
        String iv=myObj.nextLine();
        int [] duom=new int[3];
        System.out.println("Įveskite kruveles spalvos raide(Z R G) ir kiekį Pvz.: Z 14");
        for (int i = 0; i <= kruv-1; i++) {
           System.out.println("Įveskite " + (i+1) + " kruvelės spalvą ir kiekį");
            iv=myObj.nextLine();
           if(iv.substring(0,1).toUpperCase().equals("R")){
                duom[0]=duom[0]+  Integer.parseInt(iv.substring(2,iv.length()));
            }
            if(iv.substring(0,1).toUpperCase().equals("Z")){
                duom[1]=duom[1]+  Integer.parseInt(iv.substring(2,iv.length()));
            }
            if(iv.substring(0,1).toUpperCase().equals("G")){
                duom[2]=duom[2]+  Integer.parseInt(iv.substring(2,iv.length()));
            }
        }
        Skaiciavimai skaiciuot=new Skaiciavimai();
        int min=skaiciuot.minMax(duom);
            System.out.println("Liko G = " + (duom[2]-min));
        System.out.println("Liko Z = " + (duom[1]-min));
        System.out.println("Liko R = " + (duom[0]-min));



//        System.out.println(duom[0]);
//        System.out.println(duom[1]);
//        System.out.println(duom[2]);

//        truko 20 min :( Pabaigti
//        likorasti maziausiai surinktu skaiciu ir apskaiciuoti skirtumus







    }
}