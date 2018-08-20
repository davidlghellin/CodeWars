package es.david.kyu7;

public class RowWeights {
    // https://www.codewars.com/kata/row-weights/train/java

    public static int[] rowWeights(final int[] weights) {

        int equipo1 = 0;
        int equipo2 = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0)
                equipo1 += weights[i];
            else
                equipo2 += weights[i];
        }

        return new int[]{equipo1, equipo2};

        /*
        int totals[] = new int[2], idx = 0;
        for (int w : weights)
            totals[(idx++)%2] += w;
        return totals;
         */
    }
}
