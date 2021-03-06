package Manager.Controllers;

import Client.ActionMode.Request;
import Client.Services.AddRequest;
import ParentCode.Exceptions.EmptyField;
import Manager.exceptions.WrongDateException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import static Manager.Controllers.ControllerRequest.id_request;

public class ControllerAccept extends ControllerRefresh {

    @FXML
    private Button close;

    @FXML
    private Button submit;

    @FXML
    private DatePicker pickUpDate;

    @FXML
    private DatePicker returnDate;

    @FXML
    private Label message;

    @FXML
    private Label empty;

    @FXML
    private void handleClose() {
       super.handleCloseSimple(close);
    }

    @FXML
    public void handleAccept(javafx.event.ActionEvent event) throws IOException {
        try {
            if (pickUpDate.getValue() == null || returnDate.getValue() == null)
                throw new EmptyField();
            else if (pickUpDate.getValue().compareTo(returnDate.getValue()) > 0)
                throw new WrongDateException();
            for (Request r : AddRequest.requests) {
                if (AddRequest.requests.indexOf(r) == id_request) {
                    Request newRequest = r;
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    newRequest.setPickUpDate(pickUpDate.getValue().format(formatter));
                    newRequest.setReturnDate(returnDate.getValue().format(formatter));
                    newRequest.setStatus(1);
                    AddRequest.persistRequest();
                    super.handleCloseSimple(submit);
                    super.refreshRequest(event);
                }
            }
        } catch (EmptyField e) {
            message.setText(null);
            empty.setText(e.getMessage());
        } catch (WrongDateException e) {
            empty.setText(null);
            message.setText(e.getMessage());
        }
    }

    public DatePicker getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(DatePicker pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public DatePicker getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(DatePicker returnDate) {
        this.returnDate = returnDate;
    }

    public Label getMessage() {
        return message;
    }

    public void setMessage(Label message) {
        this.message = message;
    }

    public Label getEmpty() {
        return empty;
    }

    public void setEmpty(Label empty) {
        this.empty = empty;
    }
}
