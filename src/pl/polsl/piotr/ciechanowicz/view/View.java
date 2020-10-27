package pl.polsl.piotr.ciechanowicz.view;



import pl.polsl.piotr.ciechanowicz.model.Matrix;

import java.util.List;


/**
 * Class for displaying matrices
 * @author Piotr Ciechanowicz
 * @version 1.0
 */
public class View {

    /**
     * Function is used to display matrix.
     * @param matrix which is supposed to be displayed.
     */
    public static void showMatrix (Matrix matrix)
    {
        for (List<Integer> row : matrix.getValues()) {
            for (Integer value : row) {
                System.out.print(value);
                System.out.print("\t");
            }
            System.out.println("\t");
        }

    }

}
