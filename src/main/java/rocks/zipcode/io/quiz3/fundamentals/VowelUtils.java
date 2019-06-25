package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        List<String> Vowl = new ArrayList<>();
        Vowl.add("a");
        Vowl.add("e");
        Vowl.add("i");
        Vowl.add("o");
        Vowl.add("u");

        List<String> Word = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            Word.add(word.substring(i, i));
        }

        for (int i = 0; i < Vowl.size(); i++) {

                if (Word.contains(Vowl.get(i))) {

                    return true;

                }

        }

        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        String vowl = "AEIOU";

        word = word.toUpperCase();

            for (int k = 0; k < word.length(); k++) {
                for (int i = 0; i < vowl.length(); i++) {

                    if (word.charAt(k) == vowl.charAt(i)) {

                        return k;
                    }
                }
            }

            return -1;
    }


    public static Boolean startsWithVowel(String word) {

        String vowl = "AEIOU";

        word = word.toUpperCase();

        for (int i = 0; i < vowl.length(); i++) {

            if (word.charAt(0) == vowl.charAt(i)) {

                return true;
            }
        }

        return false;
    }

    public static Boolean isVowel(Character character) {

        String vowl = "aeiouAEIOU";

        for (int i = 0; i < vowl.length(); i++) {

            if (character == vowl.charAt(i)) {

                return true;
            }
        }

        return false;
    }
}
