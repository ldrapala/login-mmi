package byt.money.loginmmi.internal.controller;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class LoginMmiController implements Initializable {

    private static final ResourceBundle I18N = ResourceBundle.getBundle("i18n/i18n");

    @FXML
    private void registerButtonAction(ActionEvent event) {
        System.out.println("Register");
    }

    @FXML
    private void acceptButtonAction(ActionEvent event) {
        
        
    }

    @FXML
    private void selectLanguageAction(ActionEvent event) {
        String language = languageCombo.getSelectionModel().getSelectedItem();
        System.out.println("LANGUAGE "+language);
        Locale.setDefault(new Locale(language));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setCategories();
        localize();
    }

    public void setCategories() {
        //czytać z DB docelowo
        ObservableList<String> categories
                = FXCollections.observableArrayList(
                        "PL",
                        "EN"
                );
        languageCombo.setItems(categories);
    }

    private void localize() {
        registerButton.setText("Register");
        languageLabel.setText("Language:");
        loginLabel.setText("Login:");
        passwordLabel.setText("Password:");
        acceptButton.setText("Accept");
//        registerButton.setText(I18N.getString("registerButton"));
//        languageLabel.setText(I18N.getString("languageLabel"));
//        loginLabel.setText(I18N.getString("loginLabel"));
//        passwordLabel.setText(I18N.getString("passwordLabel"));
//        acceptButton.setText(I18N.getString("acceptButton"));
    }

    @FXML
    private Button registerButton;
    @FXML
    private Label languageLabel;
    @FXML
    private ComboBox<String> languageCombo;
    @FXML
    private Label loginLabel;
    @FXML
    private Label passwordLabel;
    @FXML
    private Button acceptButton;
}
