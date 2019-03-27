import java.util.Scanner;

public class Masyvai {


    public void vykdyti() {
        int sk = 0;
        int a;
        int b = 0;
        int c;
        Scanner ivestis = new Scanner(System.in);
        System.out.println("parašykite būsimo masyvo ilgi, n<20");
        a = ivestis.nextInt();

        int[] mas = new int[a];
        int[] mas2 = new int[a];
        int j = 0;
        System.out.println("Įveskite dar " + a + " masyvo skaičius");
        for (int i = 0; i < a; i++) {
            mas[i] = ivestis.nextInt();
        }

        {
            //System.out.println(i + "   ");
            c = mas.length;
            for (int i = 0; i < c - 1; i++)
                if (mas[i] < mas[c - 1]) {
                    mas2[j] = mas[i];
                    j++;
                    System.out.println(" skaičiai mažesni už paskutinį narį yra " + mas[i]);

                }
        }

    }

    public void vykdyti2() {
        int sk = 0;
        int a;
        Scanner ivestis = new Scanner(System.in);
        System.out.println("parašykite būsimo masyvo ilgi, n<20");
        a = ivestis.nextInt();

        int[] mas = new int[a];
        System.out.println("Įveskite " + a + " masyvo skaičius");
        for (int i = 0; i < a; i++) {
            mas[i] = ivestis.nextInt();
        }

        {
            for (int i = 0; i < mas.length; i++)
                if (mas[i] == 0)
                    System.out.println("Skaičius yra lygus 0");
                else {
                    if
                    (mas[i] % 2 != 0) {
                        System.out.println("Skaičius " + mas[i] + " yra nelyginis");
                    } else if (mas[i] % 2 == 0) {
                        System.out.println("Skaičius " + mas[i] + " yra lyginis");

                    }
                }


        }


    }


    public void vykdyti3() {

        int a;
        int c;
        Scanner ivestis = new Scanner(System.in);
        System.out.println("parašykite būsimo masyvo ilgi, n<20");
        a = ivestis.nextInt();

        int[] mas = new int[a];
        int[] mas2 = new int[a];
        int j = 0;

        System.out.println("Įveskite dar " + a + " masyvo skaičius");
        for (int i = 0; i < a; i++) {
            mas[i] = ivestis.nextInt();
        }


        for (int i = 0; i < mas.length; i++) {

            if (mas[i] % mas.length == 0) {
               // mas2[j] = mas[i];
                //  j++;
                System.out.println(" skaičiai kurie dalijasi iš masyvo ilgio " + mas[i]);

            }
        }

    }
    public void vykdyti4()
    {
        int a;
        int c;
        Scanner ivestis = new Scanner(System.in);
        System.out.println("parašykite būsimo masyvo ilgi, n<20");
        a = ivestis.nextInt();

        int[] mas = new int[a];



        System.out.println("Įveskite dar " + a + " masyvo skaičius");
        for (int i = 0; i < a; i++) {
            mas[i] = ivestis.nextInt();
        }
        int[] mas2 = new int[mas.length];
        int max = 0;
        for  (int i = 0; i<mas.length; i++)
        {
            mas[i] = max;

            for (int j=0; j<mas.length; j++)
            {if (mas[j] > max)
            {mas2[j] = mas[j];
                System.out.println("skaičius didesnis už kairiaus esanti" + mas2[j]);
            }

            }
        }



        //  Scanner ivestis = new Scanner(System.in);
        //a = ivestis.nextInt();

    }
}



