package es.david.kyu7;

import java.util.Arrays;

public class ReverseNumber {
    // https://www.codewars.com/kata/reverse-a-number/train/java

    public static int reverse(int number) {
        String[] arr = (number + "").split("");
        StringBuilder strNum = new StringBuilder("");

        if (arr[0].equals("-")) {
            strNum.append("-");
            for (int i = arr.length - 1; i >= 1; i--)
                strNum.append(arr[i]);
        } else {
            for (int i = arr.length - 1; i >= 0; i--)
                strNum.append(arr[i]);
        }

        return Integer.parseInt(strNum.toString());

        // return n < 0 ? -reverse(-n) : Integer.parseInt(new StringBuilder().append(n).reverse().toString());
        // return Integer.valueOf(new StringBuilder(""+n).reverse().toString().replace("-",""))*Integer.signum(n);
    }

}
