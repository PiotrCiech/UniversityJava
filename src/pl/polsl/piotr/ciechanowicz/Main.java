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
     *
     */
    public static void main(String[] args) {
        Matrix matrix = null;
        if (args.length < 3) {
            System.out.println("Too little arguments!");
            return;
        }

        if ("add".equals(args[0])) {
            matrix= Math.add(MatrixParser.parseString(args[1]),MatrixParser.parseString(args[2]));
        } else if ("sub".equals(args[0])) {
            matrix=Math.sub(MatrixParser.parseString(args[1]),MatrixParser.parseString(args[2]));
        } else if ("mul".equals(args[0])) {
            matrix=Math.multiply(MatrixParser.parseString(args[1]),MatrixParser.parseString(args[2]));
        } else {
            System.out.println("Invalid first argument");
            return;
        }

        View.showMatrix(matrix);

    }
}
