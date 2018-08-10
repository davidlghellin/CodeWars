package es.david.kyu8;

import java.util.Arrays;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        String n = num + "";

        String[] list = n.split("");
        Arrays.sort(list);

        String cadena = "";
        for (int i = list.length - 1; i >= 0; i--) {
            cadena += list[i];
        }

        return Integer.parseInt(cadena);
    }
}
