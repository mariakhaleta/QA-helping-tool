package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Slider countLetters;

    @FXML
    private Button canPhone;

    @FXML
    private Button fifteenLettersW;

    @FXML
    private Button FifteenLetters;

    @FXML
    private Button thouthadNumbers;

    @FXML
    private Button sixtyfourlettersW;

    @FXML
    private Button mastercard;

    @FXML
    private Button visacard;

    @FXML
    private Button americanexpress;

    @FXML
    private Button discovercard;

    @FXML
    private Button thouthadnLettersW;

    @FXML
    private Button gmPhone;

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
    private Button usPhone;

    @FXML
    private Button thouthadnSpace;

    @FXML
    private Button ukPhone;

    @FXML
    private CheckBox randomizedLetters;

    @FXML
    void initialize() {

        TextGenerate text = new TextGenerate();
        PhoneAndCards phoneAndCards = new PhoneAndCards();
        Letters letters = new Letters();


         countLetters.valueProperty().addListener(new ChangeListener<Number>() {

             @Override
             public void changed(ObservableValue<? extends Number> observable, //
                                 Number oldValue, Number newValue) {
                 int b;
                 b = (int) Math.round((Double) newValue);
                 showfield.setText(letters.generateSymbol(b));
             }
         });

        double countletters = countLetters.getValue();
        System.out.println(countletters);

//        randomizedLetters.selectedProperty().addListener(new ChangeListener<Boolean>() {
//            public void changed(ObservableValue<? extends Boolean> ov,
//                                Boolean old_val, Boolean new_val) {
//                //showfield.setText(letters.generateSymbol(b));
//            }
//        });

        fifteenLettersW.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(text.generateSymbol(15));
            }
        });
         thourteenLettersW.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(TextGenerate.generateSymbol(30));
            }
        });
        thouthadnLettersW.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(TextGenerate.generateSymbol(1024));
            }
        });
        wildsymbol.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(TextGenerate.wildSymbol());
            }
        });
        //FifteenLetters
        //sixtyfourlettersW
        thouthadnSpace.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(TextGenerate.generateSessionKey(1024));
            }
        });
        //htmlButton
        fifteenNumbers.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(text.generateNumbers(15));
            }
        });
        thouthadNumbers.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(text.generateNumbers(1024));
            }
        });
        fifteenNumberSpace.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(text.generateNumbersWithSpaces(15));
            }
        });
        //sqlQueryButton

        ukPhone.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.ukPhone());
            }
        });
        gmPhone.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.germanPhone());
            }
        });
        canPhone.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.canadaPhone());
            }
        });
        usPhone.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.usaPhone());
            }
        });
        visacard.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.visaCard());
            }
        });
        mastercard.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.masterCard());
            }
        });
        discovercard.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.discoverCard());
            }
        });
        americanexpress.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.amExpressCard());
            }
        });
    }
}

