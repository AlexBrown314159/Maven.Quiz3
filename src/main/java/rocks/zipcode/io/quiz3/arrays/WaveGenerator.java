package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {

        str = str.toLowerCase();

        String[] strOut = new String[str.length()];

        String left, center, right;

        left = str.substring(0, 1);
        left = left.toUpperCase();
        right = str.substring(1, str.length());
        strOut[0] = left + right;

        for (int i = 1; i < str.length(); i++) {

            left = str.substring(0, i);
            center = str.substring(i, i+1);
            center = center.toUpperCase();
            right = str.substring(i+1, str.length());
            strOut[i] = left + center + right;

        }

        for (int i = 0; i < str.length(); i++) {

           System.out.println(strOut[i]);

        }

        return strOut;
    }
}
