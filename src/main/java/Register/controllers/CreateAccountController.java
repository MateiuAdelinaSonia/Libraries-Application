package Register.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class CreateAccountController {

    @FXML
    private Button close;

    @FXML
    private void handleClose() {

        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void handleBack(javafx.event.ActionEvent event) throws IOException {

    }

    @FXML
    public void AccountClient(ActionEvent event) throws IOException {

    }

    @FXML
    public void AccountManager(ActionEvent event) throws IOException {

    }

}
