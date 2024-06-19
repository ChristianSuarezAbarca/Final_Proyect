package proyect.final_proyect;

import classes.Client;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;

/**
 * Controller class for handling the login screen logic.
 * Provides functionality to check user credentials and navigate to respective menus based on user type.
 */
public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    /**
     * Navigates back to the welcome screen.
     *
     * @param mouseEvent the mouse event that triggers this action
     * @throws IOException if an I/O error occurs during screen loading
     */
    @FXML
    private void goBack(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("Welcome.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    /**
     * Checks the user credentials and navigates to the corresponding menu.
     * If the credentials belong to an administrator, it loads the admin menu.
     * If the credentials belong to a client, it verifies client details and loads the client menu.
     *
     * @param mouseEvent the mouse event that triggers this action
     * @throws IOException if an I/O error occurs during user verification or screen loading
     */
    @FXML
    private void checkUser(MouseEvent mouseEvent) throws IOException {
        BufferedReader reader = null;
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (!username.isEmpty() && !password.isEmpty()){
            if (username.equals("Admin1") && password.equals("1admin1") ||
                    username.equals("Admin2") && password.equals("2admin2") ||
                    username.equals("Admin3") && password.equals("3admin3")) {
                Program.loadScreen("AdminMenu.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
            } else {
                try {
                    reader = new BufferedReader(new FileReader("src/main/resources/files/users"));
                    String line;
                    String[] array;

                    for (int i = 0; i < 4; i++) {
                        line = reader.readLine();
                    }

                    while ((line = reader.readLine()) != null) {
                        array = line.split(":");
                        if (array.length >= 2 && array[0].equals(username) && array[1].equals(password)) {
                            Program.loadScreen("ClientMenu.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
                        }
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File not found: " + e.getMessage());
                } catch (IOException e) {
                    System.out.println("File error: " + e.getMessage());
                } finally {
                    try {
                        if (reader != null) {
                            reader.close();
                        }
                    } catch (IOException e) {
                        System.out.println("Error closing file: " + e.getMessage());
                    }
                }
            }
        }
    }
}
