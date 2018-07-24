package sample;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button fifteenLettersW;

    @FXML
    private Button FifteenLetters;

    @FXML
    private Button thouthadNumbers;

    @FXML
    private Button sixtyfourlettersW;

    @FXML
    private Button thouthadnLettersW;

    @FXML
    private TextField showfield;

    @FXML
    private Button fifteenNumbers;

    @FXML
    private Button fifteenNumberSpace;

    @FXML
    private Button sqlQueryButton;

    @FXML
    private Button thourteenLettersW;

    @FXML
    private Button htmlButton;

    @FXML
    private Button wildsymbol;

    @FXML
    private Button thouthadnSpace;
    @FXML
    void initialize() {

        String s15LettersW ="abcdeghjdkansbv";
        String s15Numbers = "123456789012345";
        fifteenLettersW.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(s15LettersW);
            }
        });
         thourteenLettersW.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(s15LettersW+s15LettersW);
            }
        });
        fifteenNumbers.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(s15Numbers);
            }
        });
    }
}

