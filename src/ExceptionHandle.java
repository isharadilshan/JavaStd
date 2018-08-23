
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bunty
 */
public class ExceptionHandle {
    public static void showError(Object error) {
        String mainMessage = null;
        String title = null;
        if (error instanceof String) {
            mainMessage = (String) error;
            title = "Error!";
        } else if (error instanceof Exception) {
            Exception exceptionError = (Exception) error;
            mainMessage = "Message: " + exceptionError.getMessage()
                    + "\nStackTrace: " + Arrays.toString(exceptionError.getStackTrace());
            title = exceptionError.getClass().getName();
        }

        JOptionPane.showMessageDialog(null, mainMessage, title, JOptionPane.ERROR_MESSAGE);
    }
}
