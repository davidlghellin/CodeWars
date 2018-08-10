package es.david.kyu8;

public class ReversedArrayDigits {

    //You have to return the digits of this number within an array in reverse order.
    public static int[] digitize(long n) {
        StringBuilder num = new StringBuilder(n + "");
        num.reverse();
        int[] array = new int[num.length()];
        String[] numSplit = num.toString().split("");

        for (int i = 0; i < num.length(); i++) {
            array[i] = Integer.parseInt(numSplit[i]);
        }

        return array;
        /*
        return new StringBuilder(String.valueOf(n))
                  .reverse()
                  .toString()
                  .chars()
                  .map(i -> i - '0')
                  .toArray();
         */
    }
}
