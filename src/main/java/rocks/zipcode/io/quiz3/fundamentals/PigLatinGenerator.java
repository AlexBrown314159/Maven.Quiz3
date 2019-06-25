package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        String vowl = "aeiouAEIOU";

        for (int i = 0; i < vowl.length(); i++) {

            if (str.charAt(0) == vowl.charAt(i)) {

                str = str + "way";

                return str;
            }
        }

            for (int k = 0; k < str.length(); k++) {

                for (int i = 0; i < vowl.length(); i++) {

                if (str.charAt(k) == vowl.charAt(i)) {

                   String front = str.substring(0, k);

                   String back = str.substring(k, str.length());

                   str = back + front + "ay";

                   System.out.println(str);

                    return str;
                }
            }
        }

        str = str + "ay";

        return str;
    }
}
