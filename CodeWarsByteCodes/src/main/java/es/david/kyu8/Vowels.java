package es.david.kyu8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {

    public static int getCount(String str) {
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(str);

        int vowelsCount = 0;
        while (matcher.find())
            vowelsCount++;

        return vowelsCount;

        //otras soluciones
        //return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
        //return (int) str.chars().mapToObj(i -> (char)i).filter(i -> "aeiou".contains(String.valueOf(i))).count();
    }
}
