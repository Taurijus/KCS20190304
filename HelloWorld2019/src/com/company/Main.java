package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 0;
        int b = 2;
        int c = 8;
        System.out.println(a);
        //a++;
        a=a;
        a=a;
        a=a;
        System.out.println(++a);
        System.out.println(c / b);
        System.out.println("c=" + c);
        System.out.println("b=" + b);
        System.out.println("c*b=" + c * b);
        System.out.println(sSkaicius(6));
        pSkaiciuSpausdina(10);
        System.out.println(duSveikiSkaiciai(6, 10));
        System.out.println(sTringas('N', 'g'));

        String bb = "Namas ";
        sSveikasPliusStringas (bb);
        System.out.println(bb);
        //sSveikasPliusStringas ("Namas ");

        System.out.println();
        System.out.println(gRazina());
    }


    public static int sSkaicius(int sk) {

        int result = sk;
        return result;
    }
    public static int pSkaiciuSpausdina(int sk) {

        int result = sk;
        System.out.println("Spausdinam skaiciu " +sk);
        return result;
    }
    public static int duSveikiSkaiciai(int sk, int sk2) {

        int a=0;
        a=sk+sk2;
        return a;
    }
    public static String sTringas(char a, char a2){
        String s="";
        s+=a;
        s+=a2;
        return s;
    }
    public static void sSveikasPliusStringas(String str){

        String s="";
        s+=str;
        s+=6;
        //System.out.println(s);
    }
    public static boolean gRazina(){

        boolean res=true;
        return res;
    }
}