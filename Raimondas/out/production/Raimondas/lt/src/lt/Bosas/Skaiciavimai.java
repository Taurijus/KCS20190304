package lt.Bosas;

public class Skaiciavimai {
    public  int[] skaiciaiMazesnuUzPaskutiniNari(int pMas[]) {

        int a = 0;
        for (int i = 0; i <= pMas.length - 1; i++) {
            if (pMas[pMas.length - 1] > pMas[i]) {

                a++;
            }


        }
        int[] sk = new int[a];
        for (int i = 0; i <= pMas.length - 1; i++) {
            if (pMas[pMas.length - 1] > pMas[i]) {
                sk[i] = pMas[i];
            }
        }
        return sk;
    }

    public  int[] lyginiai(int pMas[]) {
        int a = 0;
        for (int i = 0; i <= pMas.length - 1; i++) {

            if (pMas[i] % 2 == 0) {
                a++;
            }
        }

        int[] sk = new int[a];


        int ii = 0;
        for (int i = 0; i <= pMas.length - 1; i++) {


            if (pMas[i] % 2 == 0) {
                sk[ii] = pMas[i];
                ii++;
            }

        }
        return sk;
    }

    public  int[] skaiciaiKurieDalijasiIsMasyvoElementuSkaiciaus(int pMas[]) {
        int a = 0;
        for (int i = 0; i <= pMas.length - 1; i++) {

            if (pMas[i] % pMas.length == 0) {
                a++;
            }
        }

        int[] sk = new int[a];
        int i = 0;

        int ii = 0;
        while (i <= pMas.length - 1) {


            if (pMas[i] % pMas.length == 0) {
                sk[ii] = pMas[i];
                ii++;
            }
            i++;
        }
        return sk;
    }

    public  int[] skaiciaiKurieDidesniUzEsantiKairiau(int pMas[]) {
        int a = 0;
        for (int i = 0; i <= pMas.length - 1; i++) {
            if (i + 1 < pMas.length) {
                if (pMas[i] < pMas[(i + 1)]) {
                    a++;
                }
            }
        }

        int[] sk = new int[a];


        int ii = 0;
        for (int i = 0; i <= pMas.length - 1; i++) {
            if (i + 1 < pMas.length) {


                if (pMas[i] < pMas[(i + 1)]) {
                    sk[ii] = pMas[i+1];
                    ii++;
                }
            }
        }
        return sk;
    }

}
