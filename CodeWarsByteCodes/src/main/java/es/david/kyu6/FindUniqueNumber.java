package es.david.kyu6;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueNumber {

    // https://www.codewars.com/kata/find-the-unique-number-1

    public static double findUniq(double arr[]) {
        Map<Double, Integer> mapa = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (mapa.containsKey(arr[i])) {
                int aux = mapa.get(arr[i]);
                mapa.put(arr[i], aux + 1);
            } else {
                mapa.put(arr[i], 1);
            }
        }
        double salida = 0.0;
        for (Map.Entry<Double, Integer> mm : mapa.entrySet()) {
            System.out.println(mm.getValue() + ";" + mm.getKey());
            if (mm.getValue() == 1) {

                salida = mm.getKey();
            }
        }
        return salida;
        /*
         Arrays.sort(arr);
         return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
         */
        /*
        return Arrays.stream(array).boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Entry::getKey)
                .orElse(0.0);
         */
    }
}
