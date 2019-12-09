package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {

  @FXML private Button btnClick;

  @FXML private TextArea messageTxtF;

  @FXML
  void printHello(ActionEvent event) {

    messageTxtF.setText("Hello World!");
  }
}
