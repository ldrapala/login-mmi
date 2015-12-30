package byt.money.loginmmi;

import byt.money.common.service.IStartStop;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Lukasz
 */
public class LoginMmi implements IStartStop {
    
    private static final Logger LOGGER = Logger.getLogger(LoginMmi.class.getName());

    private GridPane root;

    public LoginMmi() {
        start();
    }

    @Override
    public void start() {
        try {
            root = FXMLLoader.load(getClass().getResource("/fxml/LoginMmi.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/styles/Styles.css");
        } catch (IOException ex) {
            LOGGER.log(Level.INFO, "Exception during activate login-mmi ", ex);
        }
    }

    public GridPane getLoginMmi() {
        return root;
    }
    
    public GridPane getRegistrationMmi(){
        GridPane result = null;
        try {
            result = FXMLLoader.load(getClass().getResource("/fxml/RegistrationMmi.fxml"));
        } catch (IOException ex) {
         LOGGER.log(Level.INFO, "Exception during activate registration-mmi ", ex);
        }
        return result;
    }

    @Override
    public void stop() {
    }

}
