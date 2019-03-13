package com.Bosas;

public class Uzduotys {
    int a;

    public void  vykdyti(){
        boolean kintamas = true;
        if (kintamas){
            System.out.println("Tiesa");
        } else {
            System.out.println("Netiesa");
        }
    }
    public void daryti (int a, int b){
        //this.a = a;
        if (a>100) {
            System.out.println("Kintamojo reikšmė didesnė už 100");
        } else {
            System.out.println("Kintamojo reikšmė mažesnė už 100");
        }

        if ( 0 < a && a >100 ){
            System.out.println("Skaičiaus apibrėžtame rėžyje nėra");
        } else {

            System.out.println("Kintamojo reikšmė yra tarp 0 ir 100");
        }


    }

    public boolean checkIfNumberIsNegative(int sk){
        boolean rez;
        if (sk>0){
             rez=true;
        } else {
             rez=false;
        }
        return rez;
    }

    public boolean checkNumber(String a){
        boolean rez=false;
        if (a.length()==3){
            rez=true;
        }
        return rez;
    }

    public boolean trysParametrai( int r1, int r2, int sk){
        boolean rez=false;
        if (r1<r2){

        } else {
            System.out.println("r1 > r2");
            System.exit(1);
        }
        if (r1<sk && sk>r2){
            System.out.println("sk nėyra tarp r1 < sk > r2");
        } else {

            System.out.println("sk yra tarp r1 < sk > r2");
            rez=true;
        }
        return rez;
    }

    @Override
    public String toString(){ return "As esu Uzdavinys" +a; }




}
