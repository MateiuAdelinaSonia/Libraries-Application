package Register.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class CreateAccountController extends Controller {

    @FXML
    private Button close;

    @FXML
    private void handleClose() {
        super.handleCloseSimple(close);
    }

    @FXML
    public void handleBack(javafx.event.ActionEvent event) throws IOException {
         URL url = getClass().getClassLoader().getResource("Login/Login.fxml");
         super.handle(event, url);
    }

    @FXML
    public void AccountClient(ActionEvent event) throws IOException {
        URL url = getClass().getClassLoader().getResource("Register/Client Registration Page.fxml");
        super.handle(event, url);
    }

    @FXML
    public void AccountManager(ActionEvent event) throws IOException {
        URL url = getClass().getClassLoader().getResource("Register/Manager Registration Page.fxml");
        super.handle(event, url);
    }

}
