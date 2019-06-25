package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]`
     *         such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {

        List<Integer> IN = new ArrayList<Integer>();

        List<Integer> SQ = new ArrayList<Integer>();

        for (int i = 0; i < inputArray.length; i++) {
            IN.add(inputArray[i]);
        }

        for (int i = 0; i < squaredValues.length; i++) {
            SQ.add(squaredValues[i]);
        }

        Collections.sort(IN);

        Collections.sort(SQ);




        for (int i = 0; i < IN.size(); i++) {


                if (SQ.get(i) != IN.get(i) * IN.get(i)) {

                    return false;

                }


        }

        return true;
    }
}
