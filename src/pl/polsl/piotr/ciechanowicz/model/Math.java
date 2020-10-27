package pl.polsl.piotr.ciechanowicz.model;



/**
  * This class implements three mathematical operations which are: addition,subtraction and multiplication
 * @author Piotr Ciechanowicz
 * @version 1.0
 */
public class Math {
    /**
     * Function is used to add  matrix to matrix.
     * @param m1 First matrix on which are done operations.
     * @param m2 Second matrix on which are done operations.
     * @return matrix which is a result of addition of two matrices m1,m2.
     */

    public static Matrix add(Matrix m1, Matrix m2) {
        if (m1.getHeight() != m2.getHeight())
            return null;
        if (m1.getWidth() != m2.getWidth())
            return null;

        Matrix ret = new Matrix(m1.getWidth(), m1.getHeight());


        for (int i = 0; i < m1.getWidth(); i++)
            for (int j = 0; j < m1.getHeight(); j++) {
                int number = m1.getValue(i, j) + m2.getValue(i, j);
                ret.setValue(i, j, number);
            }

        return ret;

    }

    /**
     * Function is used to subtract matrix from matrix.
     * @param m1 First matrix on which are done operations.
     * @param m2 Second matrix on which are done operations.
     * @return matrix which is a result of subtraction of two matrices m1,m2.
     */

    public static Matrix sub(Matrix m1, Matrix m2) {
        if (m1.getHeight() != m2.getHeight())
            return null;
        if (m1.getWidth() != m2.getWidth())
            return null;

        Matrix ret = new Matrix(m1.getWidth(), m1.getHeight());


        for (int i = 0; i < m1.getWidth(); i++)
            for (int j = 0; j < m1.getHeight(); j++) {
                int number = m1.getValue(i, j) - m2.getValue(i, j);
                ret.setValue(i, j, number);
            }

        return ret;
    }

    /**
     * Function is used to multiply  matrix by matrix
     * @param m1 First matrix on which are done operations.
     * @param m2 Second matrix on which are done operations.
     * @return matrix which is a result of multiplication of two matrices m1,m2.
     */

    public static Matrix multiply(Matrix m1, Matrix m2) {
        if (m1.getHeight() != m2.getHeight())
            return null;
        if (m1.getWidth() != m2.getWidth())
            return null;

        Matrix ret = new Matrix(m1.getWidth(), m1.getHeight());


        for (int i = 0; i < m1.getWidth(); i++)
            for (int j = 0; j < m1.getHeight(); j++) {
                int number = 0;
                for (int y = 0; y < m1.getHeight(); y++) {
                    number += m1.getValue(i, y) * m2.getValue(y, j);
                }

                ret.setValue(i, j, number);
            }

        return ret;
    }
}


