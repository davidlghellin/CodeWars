package es.david.kyu8;

public class StringRepeat {

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder cadena = new StringBuilder("");
        for (int i = 0; i < repeat; i++) {
            cadena.append(string);
        }

        return cadena.toString();
        // return repeat < 0 ? "" : String.join("", Collections.nCopies(repeat, string));
    }
}
