package com.Bosas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Uzduotys uzduotys = new Uzduotys();
        uzduotys.vykdyti();
        uzduotys.daryti(101,0);
        if (uzduotys.checkIfNumberIsNegative (-1)){
            System.out.println("Skaicius yra teigiamas");
        } else {
            System.out.println("Skaicius yra neigiamas");
        }

        if (uzduotys.checkNumber("999")){
            System.out.println("Skaicius yra nurodytose ribose");
        }
        System.out.println(uzduotys.trysParametrai(10,140,50));
//        System.out.println(uzduotys);
//        lYginisNelyginis();
//        lIekana();
//        iVeskZodi();
//        iVestiSkaicius();
//        iVestiSkaiciusTikrintiString();

    }
    public static void lYginisNelyginis (){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Įveskite skaičių . . . ");
        int sk=myObj.nextInt();

        int rez=sk % 2;
        if (rez == 1) {
            System.out.println("Įvedėte nelyginį skaičių " + sk);
        } else {
            System.out.println("Įvedėte lyginį skaičių " + sk);
        }
//        System.out.println(sk % 2);

    }
    public static void lIekana(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Įveskite sveika skaičių . . . ");
        int sk=myObj.nextInt();
        int rez=sk % 3;

        switch (rez){
            case 0:
                System.out.println("įvestas skaičius " + sk + "  dalinasi iš 3 " );
                break;

            case 1:
                System.out.println("įvestas skaičius " + sk + "  nesidalina iš  3" );
                break;



        }
        if (rez>1){
            System.out.println("įvestas skaičius " + sk + " nesidalina iš 3 " );
        }

        rez=sk % 5;
//        System.out.println(rez);
        switch (rez){
            case 0:
                System.out.println("įvestas skaičius " + sk + " dalinasi iš 5 ");
                break;

            case 1:
                System.out.println("įvestas skaičius " + sk + " nesidalina iš 5 " );
                break;

        }
        if (rez>1){
            System.out.println("įvestas skaičius " + sk + " nesidalina iš 5 " );
        }
        rez=sk % 7;

        switch (rez){
            case 0:
                System.out.println("įvestas skaičius " + sk + " dalinasi iš  7" );
                break;

            case 1:
                System.out.println("įvestas skaičius " + sk + " nesidalina iš 7 " );
                break;


        }
        if (rez>1){
            System.out.println("įvestas skaičius " + sk + " nesidalina iš 7 " );
        }


    }

    public static void iVeskZodi(){

        Scanner myObj = new Scanner(System.in);

        System.out.println("Įveskite žodį . . . ");
        String zod=myObj.nextLine();


        while (!zod.equals("pabaiga")){
            System.out.println("Įveskite žodį . . . ");
             zod=myObj.nextLine();
            System.out.println(zod);
        }


    }
    public static void iVestiSkaicius(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Įveskite skaičių . . . ");
        double sk=myObj.nextDouble();

        double rez=0;

        while (sk !=0){
            rez=rez+sk;
            System.out.println("Įveskite skaičių . . . ");
            sk=myObj.nextDouble();

        }
        System.out.println(rez);
    }
    public static void iVestiSkaiciusTikrintiString(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Įveskite skaičių . . . ");
        String sk=myObj.nextLine();
        double sk1=0;
        double rez=0;
        while( !sk.matches("\\d+") ) {
            System.out.println("Įveskite skaičių . . . ");
            sk=myObj.nextLine();


            if ( sk.matches("\\d+") ){
                sk1=Integer.parseInt(sk);
            }
            while (sk1 != 0) {
                rez = rez + sk1;
                System.out.println("Įveskite skaičių . . . ");
                sk1 = myObj.nextDouble();

            }

        }
        System.out.println(rez);
    }
}
