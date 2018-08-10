package es.david.kyu7;

public class CountDig {

    /*
    Tome un número entero n (n >= 0)y un dígito d (0 <= d <= 9)como un número entero.
     Cuadre todos los números k (0 <= k <= n)entre 0 y n. Cuente los números de dígitos
     dutilizados en la escritura de todos los k**2. Llame nb_dig(o nbDig o ...) a la
      función que toma ny dcomo parámetros y devuelva este conteo.
     */
    public static int nbDig(int n, int d) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int cuadrado = i * i;
            String dStr = d + "";
//            if ((cuadrado + "").contains(dStr)) {
//                count++;
//            }


            String[] cuadradoStr = (cuadrado + "").split("");
            for (int j = 0; j < cuadradoStr.length; j++) {
                if ((cuadradoStr[j]) .equals(dStr)) {
                    count++;
                }
            }
        }

        return count;
    }
}
