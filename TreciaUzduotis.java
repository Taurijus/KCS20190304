import java.util.Scanner;

public class TreciaUzduotis {

    public static void main (String[]args) {
        System.out.println("Iveskite kiek ir kokiu juosteliu sukarpe");

        System.out.println("Iveskite geltonu juosteliu skaiciu");

        Scanner scanner = new Scanner(System.in);

        int geltona = scanner.nextInt();

        System.out.println("Iveskite zaliu juosteliu skaiciu");

        Scanner scanner1 = new Scanner(System.in);

        int zalia = scanner1.nextInt();

        System.out.println("Iveskite raudonu juosteliu skaiciu");

        Scanner scanner2 = new Scanner(System.in);

        int raudona = scanner2.nextInt();

        karpytuJuosteliuSkaicius(geltona, zalia, raudona);

        karpytuJuosteliuLikutis(geltona, zalia, raudona);

        juosteliuLikuciai(geltona, zalia, raudona);
    }

    private static void karpytuJuosteliuSkaicius (int g, int z, int r) {

        int geltona = 0;

        int zalia = 0;

        int raudona = 0;

        //Surandama maziausia. Padalinama is dvieju ir gaunam kiek padaryta buvp veliaveliu.
        if (g < z && g < r) {
            geltona = g / 2;
            System.out.println("Buvo suklijuotos " + geltona + " veliaveles");
        }

        if (z < g && z < r) {
            zalia = z / 2;
            System.out.println("Buvo suklijuotos " + zalia + " veliaveles");
        }

        if (r < z && r < g) {
            raudona = r / 2;
            System.out.println("Buvo suklijuotos " + raudona + " veliaveles");
        }

    }

    private static void karpytuJuosteliuLikutis (int g, int z, int r) {

        int geltona = 0;

        int zalia = 0;

        int raudona = 0;

        //Surandama maziausia. Padalinama is dvieju ir gaunam kiek padaryta buvp veliaveliu.
        if (g > z && g > r) {
            int suma1 = g - r;
            int suma2 = g - z;
            int suma = suma1 + suma2;
            System.out.println("Likusiu gabaliuku skaicius yra " + suma);

        }

        if (z > g && z > r) {
            int suma1 = z - r;
            int suma2 = z - g;
            int suma = suma1 + suma2;
            System.out.println("Likusiu gabaliuku skaicius yra " + suma);
        }

        if (r > z && r > g) {
            int suma1 = r - g;
            int suma2 = r - z;
            int suma = suma1 + suma2;
            System.out.println("Likusiu gabaliuku skaicius yra " + suma);
        }

    }

    private static void juosteliuLikuciai (int g, int z, int r) {

        if (g > z && g > r) {
            int raudonuLikutis = g - r;
            int zaliuLikutis = g - z;
            if ((g % 2) == 0) {
                System.out.println("Likusiu geltonu gabaliuku skaicius yra 0");
                System.out.println("Likusiu raudonu gabaliuku skaicius yra " + raudonuLikutis);
                System.out.println("Likusiu zaliu gabaliuku skaicius yra " + zaliuLikutis);
            }else {
                System.out.println("Likusiu geltonu gabaliuku skaicius yra 1");
                System.out.println("Likusiu raudonu gabaliuku skaicius yra " + raudonuLikutis);
                System.out.println("Likusiu zaliu gabaliuku skaicius yra " + zaliuLikutis);
            }

        }

        if (z > g && z > r) {
            int raudonuLikutis = z - r;
            int geltonuLikutis = z - g;
            if ((z % 2) == 0) {
                System.out.println("Likusiu geltonu gabaliuku skaicius yra " + raudonuLikutis);
                System.out.println("Likusiu raudonu gabaliuku skaicius yra " + geltonuLikutis);
                System.out.println("Likusiu zaliu gabaliuku skaicius yra 0");
            } else {
                System.out.println("Likusiu geltonu gabaliuku skaicius yra " + raudonuLikutis);
                System.out.println("Likusiu raudonu gabaliuku skaicius yra " + geltonuLikutis);
                System.out.println("Likusiu zaliu gabaliuku skaicius yra 1");
            }
        }

        if (r > z && r > g) {
            int geltonuLikutis = r - g;
            int zaliuLikutis = r - z;
            if ((r % 2) == 0) {
                System.out.println("Likusiu geltonu gabaliuku skaicius yra " + geltonuLikutis);
                System.out.println("Likusiu raudonu gabaliuku skaicius yra 0");
                System.out.println("Likusiu zaliu gabaliuku skaicius yra " + zaliuLikutis);
            } else {
                System.out.println("Likusiu geltonu gabaliuku skaicius yra " + geltonuLikutis);
                System.out.println("Likusiu raudonu gabaliuku skaicius yra 1");
                System.out.println("Likusiu zaliu gabaliuku skaicius yra " + zaliuLikutis);
            }
        }

    }


}
