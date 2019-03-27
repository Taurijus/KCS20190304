package lt.Bosas;

public class Spausdinti {
    public  String paruostiSpausdinti(int pMas[]) {
        String rez = "";
        for (int a : pMas) {
            rez = rez + a + " ";

        }
        return rez;
    }

    public  void spausdinti(int duota[], int gauta[]) {
        String ka1 = paruostiSpausdinti(duota);
        String ka2 = paruostiSpausdinti(gauta);
        System.out.println("{ " + ka1 + " } => { " + ka2 + "}");

    }
}

