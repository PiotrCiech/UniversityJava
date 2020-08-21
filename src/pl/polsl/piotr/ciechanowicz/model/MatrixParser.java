/**
 * pl.polsl.piotr.ciechanowicz.view package which contains class for displaying data
 */

package pl.polsl.piotr.ciechanowicz.model;

/**
 * Class for printing data into console
 * @author Piotr Ciechanowicz
 * @version 1.0
 */
public class MatrixParser {

    /**
     *Function used to parse a string into an object of type Matrix
     * @param  matrix which is supposed to be converted from string to the matrix object
     * @return object of type Matrix
     */
    public static Matrix parseString(String matrix) {
        String copyMatrix = matrix;
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
                else if (subChar == ';') {
                    y++;
                    x = 0;
                }
                subMatrix = new StringBuilder();
            }
        }
        return ret;
    }
}
