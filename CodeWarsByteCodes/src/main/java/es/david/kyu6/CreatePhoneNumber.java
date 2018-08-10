package es.david.kyu6;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder cadena = new StringBuilder();
        cadena.append("(");
        for (int i = 0; i < 3; i++)
            cadena.append(numbers[i]);
        cadena.append(") ");

        for (int i = 3; i < 6; i++)
            cadena.append(numbers[i]);
        cadena.append("-");
        for (int i = 6; i < 10; i++)
            cadena.append(numbers[i]);
        return cadena.toString();

        // return "("+n[0]+n[1]+n[2]+") "+n[3]+n[4]+n[5]+"-"+n[6]+n[7]+n[8]+n[9];

        // return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);

        // return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());

        /*
        String phoneNumber = new String("(xxx) xxx-xxxx");

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }
         */
    }
}
