package es.david.kyu8;

public class CenturyFromYearJava {

    public static int century(int number) {
        int modulo = number % 100;
        int cen = number / 100;

        if (modulo == 0)
            return cen;
        else
            return cen + 1;
    }
}
