package pl.polsl.piotr.ciechanowicz.view;



import pl.polsl.piotr.ciechanowicz.model.Matrix;


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
        for (int i = 0; i < matrix.getHeight(); i++) {
            for (int j = 0; j < matrix.getWidth(); j++) {
                System.out.print(matrix.getValue(j,i));
                System.out.print("\t");
            }
            System.out.println("\t");
        }

    }

}
