package es.david.kyu7;

public class Covfefe {
    /*
    Le dan una cuerda. Debe reemplazar la (s) palabra (s) coveragepor covfefe, sin embargo, si no encuentra la palabra coverageen la cadena, debe agregar covfefeal final de la cadena un espacio inicial.

Para los idiomas en los que la cadena no es inmutable (como ruby), no modifique la cadena dada, de lo contrario, se romperán los casos de prueba.
     */
    public static String covfefe(String tweet) {
        if (!tweet.contains("coverage")) {
            return tweet + " covfefe";
        }

        return tweet.replaceAll("coverage", "covfefe");
        //return tweet.contains("coverage") ? tweet.replaceAll("coverage", "covfefe") : tweet + " covfefe";
    }

}
