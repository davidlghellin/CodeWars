package es.david.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindElImpar {
    // https://www.codewars.com/kata/find-the-odd-int

    public static int findIt(int[] a) {

        Map<Integer, Integer> mapa = new HashMap<>();

        for (int n : a) {
            if (!mapa.containsKey(n))
                mapa.put(n, 1);
            else
                mapa.put(n, mapa.get(n) + 1);
        }
        int impar = -99;
        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() % 2 == 1)
                impar = entry.getKey();
        }
        return impar;
        // return Arrays.stream(a).reduce(0, (x, y) -> x ^ y);
        // return Arrays.stream(a).reduce((x, y) -> x ^ y).getAsInt();
        /*
        int odd=0;
        for (int item: A)
        {
            odd = odd ^ item;// XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
        }

        return odd;
         */
    }
}
