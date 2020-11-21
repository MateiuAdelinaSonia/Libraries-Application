package Client.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Controller extends ParentCode.Controller {

    @FXML
    public void handle(javafx.event.ActionEvent event, URL url) throws IOException {
        Parent home = FXMLLoader.load(url);
        Scene scene = new Scene(home);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void LibrariesPage(javafx.event.ActionEvent event) throws IOException {
        URL url = getClass().getClassLoader().getResource("Client/ClientPage.fxml");
        this.handle(event, url);
    }

    @FXML
    public void RequestPage(javafx.event.ActionEvent event) throws IOException {
        URL url = getClass().getClassLoader().getResource("Client/ClientRequestPage.fxml");
        this.handle(event, url);
    }

    @FXML
    public void handleBooks(javafx.event.ActionEvent event) throws IOException {
        URL url = getClass().getClassLoader().getResource("Client/AllBooksPage.fxml");
        this.handle(event, url);
    }

    public void handleAction(URL url) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(url);
        Parent home = loader.load();
        Scene scene = new Scene(home);
        ControllerBookDetails control = loader.getController();
        control.getDetails();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void actiuneOferta(MouseEvent event) throws IOException {
        URL url = getClass().getClassLoader().getResource("Client/Special.fxml");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(url);
        Parent home = loader.load();
        Scene scene = new Scene(home);
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }
}
