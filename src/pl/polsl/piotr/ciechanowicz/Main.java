/**
 *  pl.polsl.piotr.ciechanowicz contains all classes needed to run this console app
 */

package pl.polsl.piotr.ciechanowicz;

import pl.polsl.piotr.ciechanowicz.model.Math;
import pl.polsl.piotr.ciechanowicz.model.Matrix;
import pl.polsl.piotr.ciechanowicz.model.MatrixParser;
import pl.polsl.piotr.ciechanowicz.view.View;

/**
        * This is a console application which implements methods for  Matrix including addition, subtraction and multiplication.
        *
        * @author Piotr Ciechanowicz
        * @version 1.0
        */
public class Main {

    /**
     *
     * @param args first argument is type of operation: sub-substraction, add-addition, mul- multiply.
     *  It has to be to matrices. They has to be integers. Values are separated by commas. Semicolon separated rows.
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Matrix matrix = null;
        Matrix matrix1 = null;
        Matrix matrix2 = null;
        if (args.length < 3) {
            System.out.println("Too little arguments!");
            return;
        }

        try {
            matrix1 = MatrixParser.parseString(args[1]);
            matrix2 = MatrixParser.parseString(args[2]);
        } catch (Exception e) {
            System.out.println("Invalid argument!");
            return;
        }

        if ("add".equals(args[0])) {
            matrix = Math.add(matrix1, matrix2);
        } else if ("subtract".equals(args[0])) {
            matrix = Math.sub(matrix1, matrix2);
        } else if ("multiply".equals(args[0])) {
            matrix = Math.multiply(matrix1, matrix2);
        } else {
            System.out.println("Invalid first argument");
            return;
        }

        System.out.println("The solution of " + args[0] + " these matrices: ");
        System.out.println("First matrix: ");
        View.showMatrix(matrix1);
        System.out.println("Second matrix: ");
        View.showMatrix(matrix2);
        System.out.println("Is matrix: ");
        View.showMatrix(matrix);

    }
}
