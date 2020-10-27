/**
 * pl.polsl.piotr.ciechanowicz.view package which contains class for displaying data
 */

package pl.polsl.piotr.ciechanowicz.model;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Class for printing data into console
 * @author Piotr Ciechanowicz
 * @version 1.0
 */
public class MatrixParser {

    /**
     *Function used to parse a string into an object of type Matrix
     * @param  matrix which is supposed to be converted from string to the matrix object
     * @throws Exception invalid argument exception
     * @return object of type Matrix
     */
    public static Matrix parseString(String matrix) throws Exception {
        int numberOfSemicolon = numberOfChar(matrix, ';');
        int numberOfComma = numberOfChar(matrix, ',');

        matrix = matrix.trim();
        matrix = matrix.replaceAll("[a-z]", "");
        matrix = matrix.replaceAll("[A-Z]", "");


        if ((numberOfSemicolon - 1) != numberOfComma / numberOfSemicolon) throw new Exception("Invalid argument");
        if (matrix.matches("[\\s\\S]*(,;)[\\s\\S]*")
                || matrix.matches("[\\s\\S]*(;,)[\\s\\S]*")
                || matrix.matches("[\\s\\S]*(;;)[\\s\\S]*")
                || matrix.matches("[\\s\\S]*(,,)[\\s\\S]*") ) throw new Exception("Invalid argument!");


        int width = 1;
        int height = 0;

        for (int i = 0; i < matrix.indexOf(";"); i++) {
            if (',' == matrix.charAt(i))
                width++;
        }

        for (int i = 0; i < matrix.length(); i++) {
            if (';' == matrix.charAt(i))
                height++;
        }

        Matrix ret = new Matrix(width, height);

        StringBuilder subMatrix = new StringBuilder();
        int x = 0;
        int y = 0;
        for (int i = 0; i < matrix.length(); i++) {
            char subChar = matrix.charAt(i);
            if (subChar != ';' && subChar != ',')
                subMatrix.append(subChar);
            else {
                ret.setValue(x,y,Integer.parseInt(subMatrix.toString()));

                if (subChar == ',')
                    x++;
                else {
                    y++;
                    x = 0;
                }
                subMatrix = new StringBuilder();
            }
        }
        return ret;
    }

    /**
     * This function checks how many times in the string is used specialized character
     * @param str in which character is checking
     * @param character is checking by the string
     * @return number of specific character in this string
     */
    private static int numberOfChar(String str, char character) {
        if (str == null) return 0;

        return str.chars()
                .mapToObj(i -> (char) i)
                .filter(i -> i == character)
                .collect(Collectors.toList())
                .size();
    }
}
