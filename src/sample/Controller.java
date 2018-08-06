package sample;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.StringConverter;

public class Controller {

    TextGenerate text = new TextGenerate();
    PhoneAndCards phoneAndCards = new PhoneAndCards();
    Letters letters = new Letters();
    Emails emails = new Emails();
    DateAndTime dateAndTime = new DateAndTime();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField countOfLetter;

    @FXML
    private ImageView logo;

    @FXML
    private DatePicker date;

    @FXML
    private Button fifteenLettersW;

    @FXML
    private Button FifteenLetters;

    @FXML
    private Button numberiemail;

    @FXML
    private Button thouthadNumbers;

    @FXML
    private Tab quickSymbol;

    @FXML
    private Tab numbers;

    @FXML
    private Tab phones;

    @FXML
    private Button sixtyfourlettersW;

    @FXML
    private Button mastercard;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button discovercard;

    @FXML
    private Button thouthadnLettersW;

    @FXML
    private TextField writecoutletters;

    @FXML
    private Tab email;

    @FXML
    private Button gmPhone;

    @FXML
    private Button four;

    @FXML
    private Slider countLetters;

    @FXML
    private Button fifteenNumbers;

    @FXML
    private Button sqlQueryButton;

    @FXML
    private Button sameaccount;

    @FXML
    private Button thourteenLettersW;

    @FXML
    private Button htmlButton;

    @FXML
    private Button five;

    @FXML
    private Tab letter;

    @FXML
    private Button wildsymbol;

    @FXML
    private Button ukPhone;

    @FXML
    private Button canPhone;

    @FXML
    private CheckBox letttersOnly;

    @FXML
    private Tab dateAndtime;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button visacard;

    @FXML
    private CheckBox randomizedLetters;

    @FXML
    private CheckBox spaceBetweenLetters;

    @FXML
    private Button correctemail;

    @FXML
    private Button americanexpress;

    @FXML
    private Button specialemail;

    @FXML
    private Button incorrectemail;

    @FXML
    private CheckBox upperCaseLetters;

    @FXML
    private TextField showfield;

    @FXML
    private Button fifteenNumberSpace;

    @FXML
    private Button usPhone;

    @FXML
    private Button populardomain;

    @FXML
    private Button thouthadnSpace;

    @FXML
    void initialize() {

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
//        String writecounts = writecoutletters.getText();
//        int writeintcounts = Integer.parseInt(writecounts);
//        System.out.println(writeintcounts);

//        randomizedLetters.selectedProperty().addListener(new ChangeListener<Boolean>() {
//            public void changed(ObservableValue<? extends Boolean> ov,
//                                Boolean old_val, Boolean new_val) {
//                //showfield.setText(letters.generateSymbol(b));
//            }
//        });


        fifteenLettersW.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(text.generateSymbol(15));
            }
        });
        thourteenLettersW.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(TextGenerate.generateSymbol(30));
            }
        });
        thouthadnLettersW.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(TextGenerate.generateSymbol(1024));
            }
        });
        wildsymbol.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(TextGenerate.wildSymbol());
            }
        });
        //FifteenLetters
        //sixtyfourlettersW
        thouthadnSpace.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(TextGenerate.generateSessionKey(1024));
            }
        });
        //htmlButton
        fifteenNumbers.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(text.generateNumbers(15));
            }
        });
        thouthadNumbers.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(text.generateNumbers(1024));
            }
        });
        fifteenNumberSpace.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(text.generateNumbersWithSpaces(15));
            }
        });
        //sqlQueryButton

        ukPhone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.ukPhone());
            }
        });
        gmPhone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.germanPhone());
            }
        });
        canPhone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.canadaPhone());
            }
        });
        usPhone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.usaPhone());
            }
        });
        visacard.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.visaCard());
            }
        });
        mastercard.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.masterCard());
            }
        });
        discovercard.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.discoverCard());
            }
        });
        americanexpress.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(phoneAndCards.amExpressCard());
            }
        });

        correctemail.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(emails.correctEmail());
            }
        });

        populardomain.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(emails.popularDomain());
            }
        });

        sameaccount.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(emails.sameaccount());
            }
        });

        numberiemail.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(emails.numbersInEmail());
            }
        });

        specialemail.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(emails.specialmail());
            }
        });

        incorrectemail.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                showfield.setText(emails.incorrectEmail());
            }
        });

        StringConverter<LocalDate> converter1 = new StringConverter<LocalDate>() {
            DateTimeFormatter dateFormatter =
                    DateTimeFormatter.ofPattern("MM/dd/yyyy");

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        };

        date.setConverter(converter1);
        date.setPromptText("MM/dd/yyyy");

        StringConverter<LocalDate> converter2 = new StringConverter<LocalDate>() {
            DateTimeFormatter dateFormatter =
                    DateTimeFormatter.ofPattern("MM-dd-yyyy");

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        };

        StringConverter<LocalDate> converter3 = new StringConverter<LocalDate>() {
            DateTimeFormatter dateFormatter =
                    DateTimeFormatter.ofPattern("dd/MM/yyyy");

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        };

        StringConverter<LocalDate> converter4 = new StringConverter<LocalDate>() {
            DateTimeFormatter dateFormatter =
                    DateTimeFormatter.ofPattern("dd-MM-yyyy");

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        };

        StringConverter<LocalDate> converter5 = new StringConverter<LocalDate>() {
            DateTimeFormatter dateFormatter =
                    DateTimeFormatter.ofPattern("dd.MM.yyyy");

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        };

        StringConverter<LocalDate> converter6 = new StringConverter<LocalDate>() {
            DateTimeFormatter dateFormatter =
                    DateTimeFormatter.ofPattern("MM.dd.yyyy");

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    String n = dateFormatter.format(date);
                    return n;
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        };

        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                date.setConverter(converter1);
                date.setPromptText("MM/dd/yyyy");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.US);
                String formattedValue = (date.getValue()).format(formatter);
                showfield.setText(formattedValue);
            }
        });

        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                date.setConverter(converter2);
                date.setPromptText("MM-dd-yyyy");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US);
                String formattedValue = (date.getValue()).format(formatter);
                showfield.setText(formattedValue);
            }
        });

        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                date.setConverter(converter3);
                date.setPromptText("dd/MM/yyyy");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
                String formattedValue = (date.getValue()).format(formatter);
                showfield.setText(formattedValue);
            }
        });

        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                date.setConverter(converter4);
                date.setPromptText("dd-MM-yyyy");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US);
                String formattedValue = (date.getValue()).format(formatter);
                showfield.setText(formattedValue);
            }
        });

        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                date.setConverter(converter5);
                date.setPromptText("dd.MM.yyyy");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.US);
                String formattedValue = (date.getValue()).format(formatter);
                showfield.setText(formattedValue);
            }
        });

        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                date.setConverter(converter6);
                date.setPromptText("MM.dd.yyyy");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy", Locale.US);
                String formattedValue = (date.getValue()).format(formatter);
                showfield.setText(formattedValue);
            }
        });

        date.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                LocalDate date1 = date.getValue();
                writeMessage(date1);
            }
        });
        date.setValue(dateAndTime.NOW_LOCAL_DATE());

    }

    private void writeMessage(LocalDate msg)
    {
        showfield.setText(String.valueOf(msg));
    }

    public void CheckBoxesLetters(ActionEvent event){

        if (randomizedLetters.isSelected()){
            showfield.setText(letters.random(20));
        }
        if(spaceBetweenLetters.isSelected()){
            showfield.setText(letters.space(20));
        }
        if(upperCaseLetters.isSelected()){
            showfield.setText(letters.upperCase(20));
        }
        if(letttersOnly.isSelected()){
            showfield.setText(letters.generateSymbol(20));
        }
        if(randomizedLetters.isSelected()&&spaceBetweenLetters.isSelected()){
            showfield.setText(letters.symbolWithSpaces(20));
        }
        if(randomizedLetters.isSelected() && upperCaseLetters.isSelected()){
            showfield.setText(letters.upperCaseRandom(20));
        }
        if(randomizedLetters.isSelected() && letttersOnly.isSelected()){
            showfield.setText(letters.symbolWithSpaces(20));
        }
        if(spaceBetweenLetters.isSelected() && upperCaseLetters.isSelected()){
            showfield.setText(letters.upperCaseSpace(20));
        }
        if(spaceBetweenLetters.isSelected() && letttersOnly.isSelected()){
            showfield.setText(letters.upperCaseSpace(20));
        }
         if(randomizedLetters.isSelected() && spaceBetweenLetters.isSelected() && upperCaseLetters.isSelected()){
            showfield.setText(letters.upperCaseRandomSpace(20));
        }
        if(randomizedLetters.isSelected() && spaceBetweenLetters.isSelected() && letttersOnly.isSelected()){
            showfield.setText(letters.symbolWithSpacesOnlyLetters(20));
        }
        if(randomizedLetters.isSelected() && upperCaseLetters.isSelected() && letttersOnly.isSelected()){
            showfield.setText(letters.upperCaseRandomSpace(20));
        }
        if(spaceBetweenLetters.isSelected() && upperCaseLetters.isSelected() && letttersOnly.isSelected()){
            showfield.setText(letters.upperCaseSpace(20));
        }
         if (randomizedLetters.isSelected() && spaceBetweenLetters.isSelected() && upperCaseLetters.isSelected() && letttersOnly.isSelected()) {
            showfield.setText(letters.symbolWithSpacesOnlyLetters(20));
        }

    }

    public void CheckBoxesNumbers(ActionEvent event){


    }
}


