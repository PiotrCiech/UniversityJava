/**
 * pl.polsl.piotr.ciechanowicz.view package which contains class for displaying data
 */

package pl.polsl.piotr.ciechanowicz.model;

/**
 * This class represents matrix.
 * @author Piotr Ciechanowicz.
 * @version 1.0.
 */


public class Matrix {
    private int width, height;
    private int values[][];

    /**
     *
     * @param width represents number of columns
     * @param height represents number of rows
     */
    public Matrix(int width, int height) {
        this.width = width;
        this.height = height;
        values = new int[width][height];
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                values[i][j] = 0;
    }
    /**
     *
     * @param x represents column number
     * @param y represents row number
     * @param value which is to be set to the given position
     */
    public void setValue(int x, int y, int value) {
        if ( x < 0 || x >= width || y < 0 || y >= height)
            return;
        this.values[x][y] = value;
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
        return this.values[x][y];
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
}
