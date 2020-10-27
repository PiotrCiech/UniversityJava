/**
 * pl.polsl.piotr.ciechanowicz.view package which contains class for displaying data
 */

package pl.polsl.piotr.ciechanowicz.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents matrix.
 * @author Piotr Ciechanowicz.
 * @version 1.0.
 */


public class Matrix {
    /**
     * represents number of columns of matrix
     */
    private int width;

    /**
     * represents number of rows of matrix
     */
    private int height;

    /**
     * stores the values of matrix
     */
    private List<List<Integer>> values;

    /**
     * @param width represents number of columns
     * @param height represents number of rows
     */

    public Matrix(int width, int height) {
        this.width = width;
        this.height = height;
        values = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < height; j++)
                row.add(0);
            values.add(row);
        }
    }
    /**
     *
     * @param x represents column number
     * @param y represents row number
     * @param value which is to be set to the given position
     */

    public void setValue(int x, int y, int value) {
        if (x < 0 || x >= width || y < 0 || y >= height)
            return;
        this.values.get(x).set(y, value);
    }

    /**
     *
     * @param x represents column number
     * @param y represents row number
     * @return value on the given position
     */

    public Integer getValue(int x, int y) {
        if ( x < 0 || x >= width || y < 0 || y >= height)
            return null;
        return this.values.get(x).get(y);
    }

    /**
     *
     * @return width of the matrix
     */

    public int getWidth() {
        return width;
    }

    /**
     *
     * @return height of the matrix
     */

    public int getHeight() {
        return height;
    }

    /**
     *
     * @return returns list of list contains specific row of the matrix contains values
     */
    public List<List<Integer>> getValues() {
        return values;
    }
}
